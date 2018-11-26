package com.luzengtao.lesson5;

public class Cylinder extends Circle{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public Cylinder(){
        this.length=1;
    }
//    计算圆柱体的体积
//    public double findVolume(){
//        return  findArea()*length;
//    }
//    覆盖findArea()方法,计算圆柱的表面积
    @Override
    public double findArea() {
        return super.findArea()*2+Math.PI*2*getRadius()*length;
    }
//    计算圆柱的体积
    public double findVolume(){
        return super.findArea()*length;
    }
}
