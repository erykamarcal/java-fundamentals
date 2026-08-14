package javastudies.functionalProgramming.comparator.application;

import javastudies.functionalProgramming.comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Tablet", 450.00));


        products.sort((product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
