package com.company.HomeTask6dot3;

import com.company.HomeTask6dot3.Movable;

public class MovablePoint implements Movable {
    int x;
    int y;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    int xSpeed;
    int ySpeed;

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MoveablePoint(x = %d, y = %d, xSpeed = %d, ySpeed = %s)", x,y,xSpeed,ySpeed );
    }
}
