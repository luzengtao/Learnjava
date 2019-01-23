package com.luzengtao.learn.ex3;

import org.testng.annotations.Test;

public class TestOverLoad {
	
	public void mOl(int i) {
		System.out.println(i * i);
	}
	
	public void mOl(int i, int j) {
		System.out.println(i * j);
	}
	
	public void mOl(String msg) {
		System.out.println("CallMOL: "+msg);
	}
	
	@Test
	public void testOverLoad() {
		TestOverLoad tol = new TestOverLoad();
		tol.mOl(6);
		tol.mOl(4, 5);
		tol.mOl("hello");
	}
	
	public int max(int i,int j) {
		return i>j ? i:j;
	}
	
	public double max(double i,double j) {
		return i>j ? i:j;
	}
	
	public double max(double i,double j,double k) {
		return max(max(i,j),k);
	}
	
	@Test
	public void testOverLoad2() {
		TestOverLoad tol = new TestOverLoad();
		System.out.println(tol.max(1, 2));
		System.out.println(tol.max(1.1, 2.2));
		System.out.println(tol.max(1.1, 2.2,0.5));
	}
}
