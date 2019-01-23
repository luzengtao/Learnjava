package com.luzengtao.learn.ex1;

public class PassObject {
	
	public void pringtAreas(Circle c, int time) {
		
		System.out.println("radius\t\tarea");
		
		for(int i = 1; i <= time; i++) {
			
			c.setRadius(i);
			
			System.out.println(c.getRadius() +"\t\t"+ c.findArea());
		}
	}
}
