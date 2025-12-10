package org.vanier.labs.lab17.lsp;

/**Task3 - Liskov Substitution Principle (LSP) & Interface Segregation Principle (ISP)
 Model different types of vehicles. Refactor so only appropriate vehicles can use certain features (e.g., only ElectricCar has charge(), GasCar has refeul()). Vehicle has make, model, year. Vehicles start() and charge() or refeul().
*/

public class Main {
    public static void main(String[] args) {
        Vehicle tesla = new ElectricCar("Tesla", "Model Y", 2024);
        Vehicle honda = new GasCar("Honda", "Civic", 2020);

        tesla.start();
        honda.start();
    }
}


