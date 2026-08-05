package javastudies.collections.set.courseEnrollment.application;

import javastudies.collections.set.courseEnrollment.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Student> courseA = new HashSet<>();
        Set<Student> courseB = new HashSet<>();
        Set<Student> courseC = new HashSet<>();



        System.out.print("How many students for course A?: ");
        int quantityA = scanner.nextInt();
        for (int i = 0; i < quantityA ; i++) {
            int id = scanner.nextInt();
            courseA.add(new Student(id));
        }
        System.out.print("How many students for course B?: ");
        int quantityB = scanner.nextInt();
        for (int i = 0; i < quantityB ; i++) {
            int id = scanner.nextInt();
            courseB.add(new Student(id));
        }
        System.out.print("How many students for course C?: ");
        int quantityC = scanner.nextInt();
        for (int i = 0; i < quantityC ; i++) {
            int id = scanner.nextInt();
            courseC.add(new Student(id));
        }

        Set<Student> totalStudents = new HashSet<>(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        System.out.println("Total students: " + totalStudents.size());



        scanner.close();
    }
}
