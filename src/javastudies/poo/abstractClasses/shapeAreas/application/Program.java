package javastudies.poo.abstractClasses.shapeAreas.application;

import javastudies.poo.abstractClasses.shapeAreas.entities.Circle;
import javastudies.poo.abstractClasses.shapeAreas.entities.Rectangle;
import javastudies.poo.abstractClasses.shapeAreas.entities.Shape;
import javastudies.poo.abstractClasses.shapeAreas.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int shapesCount = scanner.nextInt();

        for (int i = 1; i <= shapesCount ; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = Character.toLowerCase(scanner.next().charAt(0));
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());
            if (shape == 'r'){
                System.out.print("Width: ");
                Double width = scanner.nextDouble();
                System.out.print("Height: ");
                Double height = scanner.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            }
            else if (shape == 'c') {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                shapes.add(new Circle(color,radius));
            } else {
                System.out.println("Invalid option.");
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape sh : shapes){
            System.out.println(sh);
        }
        scanner.close();
    }
}
