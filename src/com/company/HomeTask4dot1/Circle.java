package com.company.HomeTask4dot1;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double area;
        double pi = 3.14;
        area = radius*radius*pi;

        return area;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius = %d, color = %s]",radius,color);
    }
}
