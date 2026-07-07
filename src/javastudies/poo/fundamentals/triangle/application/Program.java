package javastudies.poo.fundamentals.triangle.application;

import javastudies.poo.fundamentals.triangle.entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");

        triangleX.ladoA = scanner.nextDouble();
        triangleX.ladoB = scanner.nextDouble();
        triangleX.ladoC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.ladoA = scanner.nextDouble();
        triangleY.ladoB = scanner.nextDouble();
        triangleY.ladoC = scanner.nextDouble();

        double areaTriangleX = triangleX.area();
        double areaTriangleY = triangleY.area();

        System.out.printf("Triangle X area: %.4f%n", areaTriangleX);
        System.out.printf("Triangle Y area: %.4f%n", areaTriangleY);

        if (areaTriangleX > areaTriangleY) {
            System.out.println("Largest area: X");
        } else if (areaTriangleY > areaTriangleX){
            System.out.println("Largest area: Y");
        } else {
        System.out.println("The triangles have the same area.");
    }

        scanner.close();
    }
}
