package javastudies.poo.enumAndComposition.orderManagement.application;

import javastudies.poo.enumAndComposition.orderManagement.entities.Client;
import javastudies.poo.enumAndComposition.orderManagement.entities.Order;
import javastudies.poo.enumAndComposition.orderManagement.entities.OrderItem;
import javastudies.poo.enumAndComposition.orderManagement.entities.Product;
import javastudies.poo.enumAndComposition.orderManagement.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         Scanner scanner = new Scanner(System.in);



        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scanner.next(), formatter);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());
        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.println("How many items to this order?");
        int itensCount = scanner.nextInt();
        for (int i = 1; i <= itensCount; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


        scanner.close();
    }
}
