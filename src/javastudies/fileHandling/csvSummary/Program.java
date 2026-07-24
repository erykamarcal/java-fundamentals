package javastudies.fileHandling.csvSummary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        File sourceFile = new File(filePath);

        String sourceFolder = sourceFile.getParent();
        File outFolder = new File(sourceFolder, "out");
        if (!outFolder.exists() && !outFolder.mkdirs()) {
            System.out.println("Could not create output folder.");
        }

        File summaryFile = new File(outFolder, "summary.csv");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {

            String items = bufferedReader.readLine();

            while (items != null) {
                String[] fields = items.split(",");
                String name = fields[0];
                double unitPrice = Double.parseDouble(fields[1]);
                int quanity = Integer.parseInt(fields[2]);

                products.add(new Product(name, unitPrice, quanity));
                items = bufferedReader.readLine();

            }

        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryFile))) {

            for (Product prod : products) {
                bw.write(prod.getName() + "," + String.format("%.2f", prod.total()));
                bw.newLine();
            }
            System.out.println(summaryFile + " CREATED!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}