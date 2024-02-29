package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6;

public class MyPoint {
    private int x=0;
    private int y=0;

    public void MyPoint(){

    }
    public void MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int datos[] = new int[2];
        datos[0] = x;
        datos[1] = y;
        return datos;
    }

}
