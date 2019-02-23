package com.company.HomeTask4dot5;

public class Shape {
    String color = "red";
    boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(filled){
            return "A Shape with color of xxx and filled";
        }else{
            return "Not filled";
        }
    }
}
