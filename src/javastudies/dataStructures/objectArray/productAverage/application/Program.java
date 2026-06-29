package javastudies.dataStructures.objectArray.productAverage.application;

import javastudies.dataStructures.objectArray.productAverage.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCount  = scanner.nextInt();
        Product[] productArray = new Product[productCount];

        for (int i = 0; i < productArray.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            productArray[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (Product product : productArray) {
            sum += product.getPrice();
        }

        double averagePrice = sum / productArray.length;

        System.out.printf("AVERAGE PRICE: $ %.2f%n", averagePrice);



        scanner.close();
    }

}
