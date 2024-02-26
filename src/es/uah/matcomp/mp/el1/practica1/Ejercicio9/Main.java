package es.uah.matcomp.mp.el1.practica1.Ejercicio9;


public class Main {
    public static void main(String[] args) {
        // Test constructor and toString()
        Ball ball = new Ball(1, 2, 10, 3, 4);
        System.out.println(ball); // toString()
        // Test Setters and Getters
        ball.setX(80);
        ball.setY(35);
        ball.setRadius(5);
        ball.setXDelta(4);
        ball.setYDelta(6);
        System.out.println(ball); // toString()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());
        // Bounce the ball within the boundary
        float xMin = 0;
        float xMax = 100;
        float yMin = 0;
        float yMax = 50;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }
}
