package javastudies.poo.interfaces.comparableInterface.application;

import javastudies.poo.interfaces.comparableInterface.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        String path = "C:\\temp\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeData = bufferedReader.readLine();
            while (employeeData != null) {
                String[] fields = employeeData.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);
                employees.add(new Employee(name, salary));
                employeeData = bufferedReader.readLine();
            }
            Collections.sort(employees);
            for (Employee employee : employees){
                System.out.println(employee.getName() + "," + employee.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
