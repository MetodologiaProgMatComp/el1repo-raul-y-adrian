package es.uah.matcomp.mp.el1.practica4.Ejercicio5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius*=percent/100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[" +
                "radius=" + radius +
                "]]";
    }

}
