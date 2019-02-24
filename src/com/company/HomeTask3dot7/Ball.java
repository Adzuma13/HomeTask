package com.company.HomeTask3dot7;

public class Ball {
   private double x;
    private double y;
    private double z;

    public Ball(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("x = %d, y = %d, z = %d", x, y, z);
    }
}
