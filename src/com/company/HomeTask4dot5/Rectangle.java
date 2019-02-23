package com.company.HomeTask4dot5;

import com.company.HomeTask4dot5.Shape;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area;
        area = width*length;

        return area;
    }

    public double getPerimeter(){
        double perimetr;
        perimetr = 2*(width*length);
        return perimetr;
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width=%d and length=%d, which is a subclass of %s", width, length,super.toString());
    }
}
