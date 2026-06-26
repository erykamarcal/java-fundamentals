package javastudies.poo.product.application;

import javastudies.poo.product.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.print("Name:");
        String name = scanner.next();
        System.out.print("Price:");
        double price = scanner.nextDouble();
        System.out.print("Quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock:");

        int quantityToAdd = scanner.nextInt();
        product.addToStock(quantityToAdd);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");

        int quantityToRemove = scanner.nextInt();
        product.removeFromStock(quantityToRemove);

        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
