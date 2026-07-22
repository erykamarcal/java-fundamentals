package javastudies.poo.abstractClasses.taxPayers.application;

import javastudies.poo.abstractClasses.taxPayers.entities.Company;
import javastudies.poo.abstractClasses.taxPayers.entities.Individual;
import javastudies.poo.abstractClasses.taxPayers.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int taxPayersCount = scanner.nextInt();
        for (int i = 1; i <= taxPayersCount; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char taxPayerType = Character.toLowerCase(scanner.next().charAt(0));
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = scanner.nextDouble();
            if (taxPayerType == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenses = scanner.nextDouble();
                taxPayers.add(new Individual(name, annualIncome, healthExpenses));
            } else if (taxPayerType == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer);

        }
        double sum = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
          sum += taxPayer.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
        scanner.close();
    }
}
