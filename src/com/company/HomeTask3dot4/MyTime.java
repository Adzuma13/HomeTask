package com.company.HomeTask3dot4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
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

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        this.second++;
        if(second == 60){
            second = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute(){
        this.minute++;

        if(minute == 60){
            minute = 0;
            nextHour();
        }
        return this;
    }
    public MyTime nextHour(){
        this.hour++;

        if(hour == 24){
            hour = 0;
        }
        return this;
    }

    public MyTime previosuSecond(){
        if(second == 0){
            second = 59;
            previosuMinute();
        }else{
            this.second --;
        }
        return this;
    }
    public MyTime previosuMinute(){

        if(minute == 0){
            minute = 59;
            previosuHour();
        }else{
            this.minute --;
        }
        return this;
    }
    public MyTime previosuHour(){
        if(hour == 0){
            hour = 23;
        }else{
            this.hour --;

        }
        return this;
    }

}
