package com.company.HomeTask3dot7;

import com.company.HomeTask3dot7.Ball;

import java.util.Random;

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
        x = xDisp;
        y = yDisp;
    }

    public void jump(double zDisp) {
        z = zDisp;
    }

    public boolean near(Ball ball) {
        double distance = Math.sqrt(((ball.getX() - x)*(ball.getX() - x)) + ((ball.getY()-y)*(ball.getY()-y)));
        if (distance < 8) {
            return true;
        }
        return false;
    }

    public void kick(Ball ball) {
        Random r = new Random();
        if(near(ball)){
            ball.setXYZ(r.nextInt(20)-10 + ball.getX(),r.nextInt(20)-10 + ball.getY(), 0);

        }
    }
}

