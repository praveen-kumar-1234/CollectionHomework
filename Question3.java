/* 3.What is the advantage of CFW?
    .Consistent API
    .Reduces Programming effort
    .Increases program speed and Quality
    .Support polymorphic algorithms
    .Support Algebraic calculation
    .Thread safety
    .Immutability
    .Extensibility
 */
import java.util.*;

    // Define a Product class with attributes
    class Product {
        String name;
        double price;
        int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

 class Question3 {

        public static void main(String [] args) {

            // List to store products (flexible size)
            List<Product> products = new ArrayList<>();

// Add a new product
            products.add(new Product("T-Shirt", 19.99, 10));

            // Access details of the first product
            Product firstProduct = products.get(0);
            String productName = firstProduct.name;
            double productPrice = firstProduct.price;
            int productQuantity = firstProduct.quantity;

// Update product quantity
            firstProduct.quantity = 5;

// Iterate through all products using for-each loop
            for (Product product : products) {
                System.out.println("Product: " + product.name + ", Price: $" + product.price + ", Quantity: " + product.quantity);
            }
        }
}
