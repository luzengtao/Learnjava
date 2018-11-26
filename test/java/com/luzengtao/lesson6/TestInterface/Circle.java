package com.luzengtao.lesson6.TestInterface;

public abstract class Circle {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }
    public double findArea(){
        return Math.PI*this.radius*this.radius;
    }

    public abstract int compareTo(Object o);
}
