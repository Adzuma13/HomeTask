package com.company.HomeTask4dot5;

public class Circle extends Shape {
    double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area;
        double pi = 3.14;
        area = radius*radius*pi;

        return area;
    }

    public double getPerimeter(){
        double perimetr;
        double pi = 3.14;
        perimetr = 2*pi*radius;
        return perimetr;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius=%d, which is a subclass of %s",radius,super.toString());
    }
}
