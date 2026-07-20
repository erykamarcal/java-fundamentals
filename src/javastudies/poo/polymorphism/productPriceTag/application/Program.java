package javastudies.poo.polymorphism.productPriceTag.application;

import javastudies.poo.polymorphism.productPriceTag.entities.ImportedProduct;
import javastudies.poo.polymorphism.productPriceTag.entities.Product;
import javastudies.poo.polymorphism.productPriceTag.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int productsCount = scanner.nextInt();

        for (int i = 1; i <= productsCount; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char typeOfProduct = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String productName = scanner.nextLine();
            System.out.print("Price: ");
            Double productPrice = scanner.nextDouble();
            if (typeOfProduct == 'i' || typeOfProduct == 'I') {
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(productName, productPrice, customsFee));
            } else if (typeOfProduct == 'u' || typeOfProduct == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY):");
                LocalDate manufactureDate = LocalDate.parse(scanner.next(), formatter);
                products.add(new UsedProduct(productName, productPrice, manufactureDate));
            } else {
                products.add(new Product(productName, productPrice));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
