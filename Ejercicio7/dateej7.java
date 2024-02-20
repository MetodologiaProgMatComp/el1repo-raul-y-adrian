package Práctica1.Ejercicio7;

public class dateej7 {
    private int day;
    private int month;
    private int year;

    public dateej7(int day, int month, int year) {
        this.day = day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day > 31) {
            System.out.println("ERROR, ESE DIA NO EXISTE");
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month > 12) {
            System.out.println("ERROR, NO EXISTE ESE MES");
        } else {
            this.month = month;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void  setdate(int day, int month, int year){

    }

    @Override
    public String toString() {
        return "dateej7{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
