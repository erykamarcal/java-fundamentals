package javastudies.poo.interfaces.rentalService.application;

import javastudies.poo.interfaces.rentalService.model.entities.CarRental;
import javastudies.poo.interfaces.rentalService.model.entities.Vehicle;
import javastudies.poo.interfaces.rentalService.model.services.BrazilTaxService;
import javastudies.poo.interfaces.rentalService.model.services.RentalService;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String model = scanner.nextLine();
        System.out.print("Pickup: (dd/MM/yyyy hh:mm)");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), formatter);
        System.out.print("Return: (dd/MM/yyyy hh:mm)");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), formatter);

        CarRental carRental = new CarRental(start,finish, new Vehicle(model));

        System.out.print("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService() {
        });
        rentalService.processInvoice(carRental);
        System.out.println("INVOICE: ");
        System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: %.2f%n", carRental.getInvoice().getTotalPayment());

        scanner.close();
    }
}
