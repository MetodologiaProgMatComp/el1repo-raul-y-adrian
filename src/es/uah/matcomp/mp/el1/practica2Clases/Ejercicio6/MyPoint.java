package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6;

public class MyPoint {
    private int x=0;
    private int y=0;
    public MyPoint() {

    }
    public MyPoint(int x, int y){
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
    public void setXY(int x, int y){
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

    public double distance(int x, int y){
        int[] origen=getXY();

        return Math.sqrt((x-origen[0])*(x-origen[0])+(y-origen[1])*(y-origen[1]));
    }

    public double distance(MyPoint another){
        int[] c1=getXY();
        return Math.sqrt((another.getX()-c1[0])*(another.getX()-c1[0])+(another.getY()-c1[1])*(another.getY()-c1[1]));

    }

    public double distance(){
        int x2=getX();
        int y2=getY();

        return Math.sqrt((x2-0)*(x2-0)+(y2-0)*(y2-0));
    }


    public void myPoint(int i, int i1) {
    }
}
