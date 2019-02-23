package com.company.HomeTask3dot7;

import com.company.HomeTask3dot7.Ball;

public class Player {
    int number;
    double x;
    double y;
    double z = 0.0;

    public Player(int number, double x, double y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {

    }

    public void jump(double zDisp) {

    }

    public boolean near(Ball ball) {
        int distance = 0;
        if (distance < 8) {
            return true;
        }
        return false;
    }

    public void kick(Ball ball) {
    }
}

