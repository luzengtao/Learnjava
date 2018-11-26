package com.luzengtao.lessons3Test;

import com.luzengtao.lesson5.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setLength(3);
        System.out.println(cylinder.findVolume());
    }
}
