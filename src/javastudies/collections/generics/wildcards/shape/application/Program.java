package javastudies.collections.generics.wildcards.shape.application;

import javastudies.collections.generics.wildcards.shape.entities.Circle;
import javastudies.collections.generics.wildcards.shape.entities.Rectangle;
import javastudies.collections.generics.wildcards.shape.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 2.0));

        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));


        System.out.println("Total area: " + totalArea(circles));
    }
    public static double totalArea(List<? extends Shape> shapes){
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.area();
        } return sum;
    }
}

