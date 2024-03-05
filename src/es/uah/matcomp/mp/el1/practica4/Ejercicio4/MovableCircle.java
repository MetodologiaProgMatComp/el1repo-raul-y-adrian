package es.uah.matcomp.mp.el1.practica4.Ejercicio4;

import java.nio.file.AtomicMoveNotSupportedException;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
