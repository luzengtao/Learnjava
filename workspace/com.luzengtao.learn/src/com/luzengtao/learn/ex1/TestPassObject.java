package com.luzengtao.learn.ex1;

import org.testng.annotations.Test;

public class TestPassObject {
	@Test
	public void testPassObject(){
		PassObject po = new PassObject();
		
		Circle c = new Circle();
		
		po.pringtAreas(c, 5);
	}
	
	
}
