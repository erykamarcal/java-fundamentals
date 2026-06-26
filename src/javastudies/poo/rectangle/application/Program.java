package javastudies.poo.rectangle.application;

import javastudies.poo.rectangle.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width and height: ");
        System.out.print("width: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("height: ");
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);
        scanner.close();
    }
}
