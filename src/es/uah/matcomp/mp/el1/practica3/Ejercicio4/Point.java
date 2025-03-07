package es.uah.matcomp.mp.el1.practica3.Ejercicio4;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x=0.0f;
        this.y=0.0f;
    }

    public Point(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float [] data={x,y};
        return data;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                ')';
    }
}
