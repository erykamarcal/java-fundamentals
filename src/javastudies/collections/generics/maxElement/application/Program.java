package javastudies.collections.generics.maxElement.application;

import javastudies.collections.generics.maxElement.entities.Product;
import javastudies.collections.generics.maxElement.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        String path = "C:\\temp\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
           String product = bufferedReader.readLine();
           while (product != null){
               String [] fields = product.split(",");
               products.add(new Product(fields[0], Double.parseDouble(fields[1])));
               product = bufferedReader.readLine();
           }
            Product mostExpensive = CalculationService.max(products);
            System.out.println("Most Expensive: " + mostExpensive);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
