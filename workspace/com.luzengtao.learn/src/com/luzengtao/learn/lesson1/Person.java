package com.luzengtao.learn.lesson1;

public class Person {
    public String name;
    public int age;
    public int sex;
    
    public void study() {
    	System.out.println("studying");
    }
    
    public void showAge() {
    	System.out.println(age);
    }
    
    public void addAge(int i) {
    	age = age +i;
    	System.out.println(age);
    }
    
    public Person() {
		// TODO Auto-generated constructor stub
    	System.out.println("这是一个构造器！");
	}
  
}
