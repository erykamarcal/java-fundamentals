package javastudies.poo.interfaces.contractProcessing.application;

import javastudies.poo.interfaces.contractProcessing.model.entities.Contract;
import javastudies.poo.interfaces.contractProcessing.model.entities.Installment;
import javastudies.poo.interfaces.contractProcessing.model.service.ContractService;
import javastudies.poo.interfaces.contractProcessing.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract date:");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(scanner.next(), formatter);
        System.out.print("contract value: ");
        double contractValue = scanner.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        System.out.print("Enter the number of installments: ");
        int months = scanner.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, months);
        System.out.println("INSTALLMENTS: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        scanner.close();
    }
}
