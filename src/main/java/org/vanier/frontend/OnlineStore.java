package org.vanier.frontend;
import java.util.*;

public class OnlineStore {

    // === Inner classes ===

    public static class Category {
        private int id;
        private String name;
        public Category(int id, String name) { this.id = id; this.name = name; }
        public int getId() { return id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class Product {
        private int id;
        private String name;
        private String description;
        private double price;
        private int stockQuantity;
        private Category category;

        public Product(int id, String name, String description, double price, int stockQuantity, Category category) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.stockQuantity = stockQuantity;
            this.category = category;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDescription() { return description; }
        public double getPrice() { return price; }
        public int getStockQuantity() { return stockQuantity; }
        public Category getCategory() { return category; }
        public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
        public boolean reduceStock(int amount) {
            if (amount <= stockQuantity) {
                stockQuantity -= amount;
                return true;
            }
            return false;
        }
    }

    public static class User {
        private int id;
        private String name;
        private String email;
        private String password;
        private List<Order> orderHistory = new ArrayList<>();

        public User(int id, String name, String email, String password) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getEmail() { return email; }
        public List<Order> getOrderHistory() { return orderHistory; }
        public void addOrder(Order order) { orderHistory.add(order); }
        public boolean checkPassword(String inputPassword) { return password.equals(inputPassword); }
    }

    public static class CartItem {
        private Product product;
        private int quantity;
        public CartItem(Product product, int quantity) { this.product = product; this.quantity = quantity; }
        public Product getProduct() { return product; }
        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public double getTotalPrice() { return product.getPrice() * quantity; }
    }

    public static class Cart {
        private Map<Integer, CartItem> items = new HashMap<>();
        public void addItem(Product product, int quantity) {
            if (items.containsKey(product.getId())) {
                CartItem existing = items.get(product.getId());
                existing.setQuantity(existing.getQuantity() + quantity);
            } else {
                items.put(product.getId(), new CartItem(product, quantity));
            }
        }
        public void removeItem(int productId) { items.remove(productId); }
        public void updateItemQuantity(int productId, int quantity) {
            if (items.containsKey(productId)) {
                if (quantity <= 0) removeItem(productId);
                else items.get(productId).setQuantity(quantity);
            }
        }
        public List<CartItem> getItems() { return new ArrayList<>(items.values()); }
        public double getTotalPrice() {
            return items.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
        }
        public void clear() { items.clear(); }
    }

    public static class Order {
        private int id;
        private User user;
        private List<CartItem> items;
        private Date orderDate;
        private String status;
        public Order(int id, User user, List<CartItem> items) {
            this.id = id;
            this.user = user;
            this.items = new ArrayList<>(items);
            this.orderDate = new Date();
            this.status = "Pending";
        }
        public int getId() { return id; }
        public User getUser() { return user; }
        public List<CartItem> getItems() { return items; }
        public Date getOrderDate() { return orderDate; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        public double getTotalPrice() {
            return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
        }
    }

    public static class Payment {
        private int id;
        private Order order;
        private Date paymentDate;
        private String paymentMethod;
        private String paymentStatus;

        public Payment(int id, Order order, String paymentMethod) {
            this.id = id;
            this.order = order;
            this.paymentMethod = paymentMethod;
            this.paymentDate = new Date();
            this.paymentStatus = "Pending";
        }

        public int getId() { return id; }
        public Order getOrder() { return order; }
        public Date getPaymentDate() { return paymentDate; }
        public String getPaymentMethod() { return paymentMethod; }
        public String getPaymentStatus() { return paymentStatus; }
        public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
        public void processPayment() { this.paymentStatus = "Completed"; }
    }

    // === Store management ===

    private Map<Integer, Product> products = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();
    private Map<Integer, Category> categories = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();

    private int nextProductId = 1;
    private int nextUserId = 1;
    private int nextCategoryId = 1;
    private int nextOrderId = 1;

    // Add category
    public Category addCategory(String name) {
        Category category = new Category(nextCategoryId++, name);
        categories.put(category.getId(), category);
        return category;
    }

    // Add product
    public Product addProduct(String name, String desc, double price, int stock, Category category) {
        Product product = new Product(nextProductId++, name, desc, price, stock, category);
        products.put(product.getId(), product);
        return product;
    }

    // Register user
    public User registerUser(String name, String email, String password) {
        User user = new User(nextUserId++, name, email, password);
        users.put(user.getId(), user);
        return user;
    }

    // Place order
    public Order placeOrder(User user, Cart cart) {
        if (cart.getItems().isEmpty()) {
            throw new IllegalArgumentException("Cart is empty");
        }
        // Check stock availability
        for (CartItem item : cart.getItems()) {
            if (item.getQuantity() > item.getProduct().getStockQuantity()) {
                throw new IllegalArgumentException("Not enough stock for product: " + item.getProduct().getName());
            }
        }
        // Reduce stock
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }
        Order order = new Order(nextOrderId++, user, cart.getItems());
        orders.put(order.getId(), order);
        user.addOrder(order);
        cart.clear();
        return order;
    }

    // Find product by id
    public Product getProductById(int id) {
        return products.get(id);
    }

    // Find user by id
    public User getUserById(int id) {
        return users.get(id);
    }

    // Find category by id
    public Category getCategoryById(int id) {
        return categories.get(id);
    }

    // Find order by id
    public Order getOrderById(int id) {
        return orders.get(id);
    }
}
