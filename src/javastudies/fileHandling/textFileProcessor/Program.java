package javastudies.fileHandling.textFileProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        File file = new File("resources/input.txt");

        List<Product> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                double price = Double.parseDouble(fields[1]);

                Product product = new Product(fields[0], price);
                products.add(product);

                line = bufferedReader.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Product prod : products) {
            System.out.println(prod);
        }

        double totalValueInStock = 0.0;

        for (Product product : products) {
            totalValueInStock += product.getPrice();
        }
        System.out.printf("Total Value In Stock: R$ %.2f", totalValueInStock);

        File outputFile = new File("resources/output.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            bufferedWriter.write("PRODUCT REPORT");
            bufferedWriter.newLine();
            bufferedWriter.newLine();

            for (Product product : products) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.write("-------------------------");
            bufferedWriter.newLine();
            bufferedWriter.write(String.format("Total Value In Stock: %.2f", totalValueInStock));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}