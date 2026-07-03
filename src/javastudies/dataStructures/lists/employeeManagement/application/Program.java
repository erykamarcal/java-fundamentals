package javastudies.dataStructures.lists.employeeManagement.application;

import javastudies.dataStructures.lists.employeeManagement.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.println("Hoy many employees will be registered?");
        int numeroDeFuncionarios = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= numeroDeFuncionarios; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.print("ID: ");
            int id = scanner.nextInt();
                while (existeId(listaFuncionarios, id)){
                    System.out.print("Id already taken. Try again: ");
                    id = scanner.nextInt();
                }
            System.out.print("Name: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salary: ");
            double salario = scanner.nextDouble();
            listaFuncionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        Funcionario funcionarioEncontrado = listaFuncionarios.stream().filter(funcionario -> funcionario.getId() == id).findFirst().orElse(null);
        if (funcionarioEncontrado == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            funcionarioEncontrado.aumentarSalario(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario funcionario: listaFuncionarios) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
    public static boolean existeId(List<Funcionario> listaFuncionarios, int id){
        Funcionario funcionarioEncontrado = listaFuncionarios.stream().filter(funcionario -> funcionario.getId() == id).findFirst().orElse(null);
        return funcionarioEncontrado != null;
    }
}
