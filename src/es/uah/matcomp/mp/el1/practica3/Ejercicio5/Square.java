package es.uah.matcomp.mp.el1.practica3.Ejercicio5;

public class Square extends Rectangle {

    private double side;

    public Square() {

    }

    public Square(double side) {

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color="+this.getColor() +
                ",filled=" + this.isFilled() +"],width="+this.getWidth()+",length="+"]]";
    }
}
