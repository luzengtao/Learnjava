package com.luzengtao.learn.lesson1;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "Tom"; 
		person.age = 12;
		person.sex = 1;
		
		person.study();
		person.showAge();
		person.addAge(2);
	}
	
	
}
