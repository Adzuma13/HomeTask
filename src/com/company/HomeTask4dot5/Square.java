package com.company.HomeTask4dot5;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getLength();

    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return String.format("A Square with side=%d, which is a subclass of %s", this.getSide(), super.toString());
    }
}
