package es.uah.matcomp.mp.el1.practica2Clases.Ejercicio7;

import es.uah.matcomp.mp.el1.practica2Clases.Ejercicio6.MyPoint;

public class Myline {
    MyPoint begin = new MyPoint();
    MyPoint end = new MyPoint();



    public Myline(int x1, int y1, int x2, int y2){

    }
    public Myline(MyPoint begin, MyPoint end) {

    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }





    //FUNCIONES DEL BEGIN
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }


    //Funciones del end
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }

    //FUNCIONES PARA XY
    //BEGIN
    public int[] getBeginXY(){
        return begin.getXY();
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    //END
    public int[] getEndXY(){
        return end.getXY();
    }

    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    //LENGTH
    public double getLength(){
        double resultado=begin.distance(end);
        return resultado;
    }
    public double getGradient(){

        return Math.atan2((getEndY()-getBeginY()),(getEndX()-getBeginX()));
    }

    @Override
    public String toString() {
        return "Myline{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}

