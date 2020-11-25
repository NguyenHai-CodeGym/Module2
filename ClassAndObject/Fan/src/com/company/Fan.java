package com.company;

import java.util.Scanner;

public class Fan {
    static final int Slow = 1;
    static final int Medium = 2;
    static final int Fast = 3;

    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static int getSlow() {
        return Slow;
    }

    public static int getMedium() {
        return Medium;
    }

    public static int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (on == false) {
            return "Fan{" +
                    "speed=" + speed +
                    ", Fan is on" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    ",Fan is off" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.Fast, false, 5, "Yellow");
        Fan fan2 = new Fan(Fan.Medium,true,10,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
