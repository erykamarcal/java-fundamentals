package javastudies.poo.abstractClasses.shapeAreas.entities;

import javastudies.poo.abstractClasses.shapeAreas.entities.enums.Color;

public class Circle extends Shape {
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle area: "
                + String.format("%.2f", area())
                + ", color: "
                + getColor();

    }
}