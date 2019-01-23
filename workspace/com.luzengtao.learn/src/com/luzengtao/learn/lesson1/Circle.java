package com.luzengtao.learn.lesson1;

public class Circle {
	
	private int radius;
	
	public double findArea() {
		return  Math.PI * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
