package es.uah.matcomp.mp.el1.practica1.Ejercicio9;


public class Ball {
    private float x;
    private float y;
    private int radius;
    private float XDelta;
    private float YDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.XDelta = xDelta;
        this.YDelta = yDelta;
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return XDelta;
    }

    public void setXDelta(float xDelta) {
        this.XDelta = xDelta;
    }

    public float getYDelta() {
        return YDelta;
    }

    public void setYDelta(float yDelta) {
        this.YDelta = yDelta;
    }

    public void move(){
        x+=XDelta;
        y+=YDelta;
    }
    public void reflectHorizontal(){
        XDelta=-XDelta;
    }
    public void reflectVertical(){
        YDelta=-YDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(X: " + x +
                "Y: )" + y +
                " speed=" +
                XDelta +
                YDelta +
                ']';
    }
}
