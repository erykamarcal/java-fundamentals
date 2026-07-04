package javastudies.dataStructures.lists.stockManagement.application;

import javastudies.dataStructures.lists.stockManagement.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products will be registered?");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        List<Product> productList = new ArrayList<>();

        for (int i = 1; i <= productCount; i++) {
            System.out.println("Product #" + i + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            while (hasProductId(productList, id)) {
                System.out.println("Id already taken. Try again: ");
                id = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productList.add(new Product(id, name, price, quantity));
        }
        System.out.print("Enter the product id to update: ");
        int id = scanner.nextInt();

        Product prod = productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
        if (prod == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Choose an operation: ");
            System.out.println("1 - Add stock");
            System.out.println("2 - Remove stock");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Quantity to add: ");
                int quantity = scanner.nextInt();
                prod.addStock(quantity);
            } else if (option == 2) {
                System.out.print("Quantity to remove: ");
                int quantity = scanner.nextInt();
                if (quantity > prod.getQuantity()) {
                    System.out.println("Insufficient stock.");
                } else {
                    prod.removeFromStock(quantity);
                }
            } else {
                System.out.println("Invalid option.");
            }
        }

        System.out.println("Product list: ");
        for (Product product : productList) {
            System.out.println(product);
        }
        scanner.close();
    }

    public static boolean hasProductId(List<Product> productList, int id) {
        Product prod = productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
        return prod != null;
    }
}
