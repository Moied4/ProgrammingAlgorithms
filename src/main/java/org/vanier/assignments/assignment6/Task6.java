/**package org.vainer.assignments.assignment6;

// =========================
// MODEL: Book
// =========================

public class Book {
    private String name;
    private String author;
    private String isbn;
    private int year;
    private double price;

    public Book(String name, String author, String isbn, int year, double price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

// =========================
// CONTROLLER: BookController
//
// =========================
package org.vanier.assignments.assignment6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.vanier.assignments.assignment6.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780590353427", 1997, 29.99));
        books.add(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "9780439064873", 1998, 24.99));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "9780439136365", 1999, 27.99));
        books.add(new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", "9780439139601", 2000, 34.99));
        books.add(new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", "9780439358071", 2003, 29.99));
        books.add(new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", "9780439785969", 2005, 31.99));

        Collections.shuffle(books);

        model.addAttribute("books", books);

        return "bookCatalog";
    }
}

<!-- =========================
VIEW: bookCatalog.html
========================= -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Book Catalog</title>
<style>
table {
    width: 80%;
    border-collapse: collapse;
    margin: 20px auto;
}
th, td {
    border: 1px solid #333;
    padding: 10px;
    text-align: left;
}
th {
    background-color: #555;
    color: white;
}
tr:nth-child(even) {
    background-color: #eee;
}
    </style>
</head>
<body>

<h2 style="text-align: center;">Book Catalog</h2>

<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Author</th>
            <th>ISBN</th>
            <th>Year</th>
<th>Price ($)</th>
        </tr>
    </thead>
    <tbody>
        <tr th:each="book : ${books}">
            <td th:text="${book.name}">Book Name</td>
            <td th:text="${book.author}">Author</td>
            <td th:text="${book.isbn}">ISBN</td>
            <td th:text="${book.year}">Year</td>
            <td th:text="${#numbers.formatDecimal(book.price, 1, 'COMMA', 2, 'POINT')}">Price</td>
        </tr>
    </tbody>
</table>

</body>
</html>
*/