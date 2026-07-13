package javastudies.poo.enumAndComposition.workerContracts.application;

import javastudies.poo.enumAndComposition.workerContracts.entities.Department;
import javastudies.poo.enumAndComposition.workerContracts.entities.HourContract;
import javastudies.poo.enumAndComposition.workerContracts.entities.Worker;
import javastudies.poo.enumAndComposition.workerContracts.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter contractFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter incomeFormatter = DateTimeFormatter.ofPattern("MM/yyyy");


        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("base salary: ");
        double baseSalary = scanner.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts for this worker? ");
        int contractsCount = scanner.nextInt();

        for (int i = 1; i <= contractsCount; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(scanner.next(), contractFormatter);
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (Hour): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter the month and year to calculate income (MM/YYYY)");
        scanner.nextLine();
        YearMonth yearMonth = YearMonth.parse(scanner.nextLine(), incomeFormatter);
        int month = yearMonth.getMonthValue();
        int year = yearMonth.getYear();
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", yearMonth.format(incomeFormatter), worker.income(year, month));
        scanner.close();
    }
}
