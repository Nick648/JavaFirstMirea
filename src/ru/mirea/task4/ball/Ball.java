package ru.mirea.task4.ball;

public class Ball {
    private double x, y;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }

    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{ " +
                "x = " + x +
                ", y = " + y +
                " } Object";
    }
}
