package javastudies.poo.grade.application;

import javastudies.poo.grade.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter the studant name: ");
        student.name = scanner.nextLine();
        System.out.print("Enter the first trimester grade: ");
        student.firstTermGrade = scanner.nextDouble();
        System.out.print("Enter the second trimester grade: ");
        student.secondTermGrade = scanner.nextDouble();
        System.out.print("Enter the third trimester grade: ");
        student.thirdTermGrade = scanner.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println("FINAL GRADE: " + finalGrade);

        if (finalGrade >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISING %.2f POINTS", student.missingPoints());
        }

        scanner.close();
    }
}
