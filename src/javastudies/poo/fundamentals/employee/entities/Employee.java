package javastudies.poo.fundamentals.employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double increaseAmount = grossSalary * percentage/100.0;
        grossSalary += increaseAmount;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
