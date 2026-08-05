package javastudies.collections.generics.printService.application;

import javastudies.collections.generics.printService.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.println("How many values?");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.firstNumber());
        scanner.close();
    }
}
