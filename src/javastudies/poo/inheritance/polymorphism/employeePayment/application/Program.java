package javastudies.poo.inheritance.polymorphism.employeePayment.application;

import javastudies.poo.inheritance.polymorphism.employeePayment.entitites.Employee;
import javastudies.poo.inheritance.polymorphism.employeePayment.entitites.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeesList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsorced = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (outsorced == 'y' || outsorced == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeesList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employeesList.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employeesList) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        scanner.close();
    }
}
