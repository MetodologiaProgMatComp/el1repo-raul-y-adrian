package es.uah.matcomp.mp.el1.Ejercicio8;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public String toString() {
        return "["+hour +
                ":" + minute +
                ":" + second +
                ']';
    }

    public Time nextSecond() {
        this.second += 1;
        if (this.second == 60) {
            this.minute += 1;
            this.second = 0;
            if (this.minute == 60) {
                this.hour += 1;
                this.minute=0;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return  this;
    }

    public Time previousSecond() {
        this.second -= 1;
        if (this.second == -1) {
            this.minute -= 1;
            this.second = 59;
            if (this.minute == -1) {
                this.hour -= 1;
                this.minute = 59;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}

