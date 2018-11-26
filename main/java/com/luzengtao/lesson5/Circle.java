package com.luzengtao.lesson5;

public class Circle {

    private double radius;
//创建设置/获得radius的方法
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//  构造方法,将radius属性初始化为1
    public Circle(){
        this.radius =1;
    }
//计算圆的面积
    public double findArea(){
        return Math.PI*Math.pow(radius,2);

    }
}
