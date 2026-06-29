package javastudies.dataStructures.objectArray.peopleStatistics.application;

import javastudies.dataStructures.objectArray.peopleStatistics.entities.Person;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people will you enter?");
        int personCount = scanner.nextInt();
        scanner.nextLine();


        Person[] people = new Person[personCount];


        for (int i = 0; i < people.length; i++) {
            System.out.println("Person #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            people[i] = new Person(name, age, height);
        }

        double totalHeight = 0.0;

        for (Person person : people) {
            totalHeight += person.getHeight();
        }

        double averageHeight = totalHeight / people.length;
        System.out.printf("Average height: %.2f%n", averageHeight);

        int underSixteenCount = 0;
        for (Person person : people) {
            if (person.getAge() < 16) {
                underSixteenCount++;
            }
        }
        double underSixteenPercentage = ((double) underSixteenCount / people.length) * 100.0;
        System.out.printf("People under 16: %.1f%%%n", underSixteenPercentage);

        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
        scanner.close();
    }
}
