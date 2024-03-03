package es.uah.matcomp.mp.el1.practica3.Ejercicio4;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public  MovablePoint(){
        super();
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float [] data={xSpeed,ySpeed};
        return data;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "(" +getX() +","+ getY()+ ")"+","+
                "Speed=(" + xSpeed +","+
                ySpeed +
                ')';
    }

    public MovablePoint move(){
        float x=getX();
        float y=getY();

        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
