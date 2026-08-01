package javastudies.poo.abstractClasses.shapeAreas.entities;

import javastudies.poo.abstractClasses.shapeAreas.entities.enums.Color;

public abstract class AbstractShape implements Shape{
    private Color color;

    public AbstractShape(){

    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
