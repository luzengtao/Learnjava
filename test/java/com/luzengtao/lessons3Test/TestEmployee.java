package com.luzengtao.lessons3Test;

public class TestEmployee {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];
        employees[0] = new Employee("Tom",5000);
        employees[1] = new Employee("jerry",4000);
        employees[2] = new Employee("Sam",7000);

        for (Employee e:employees){
            e.getId();
            System.out.println("name:" + e.getName() + " salary:" + e.getSalary() +" id:" +e.getId() );
        }

        int n = Employee.getNextId();
        System.out.println("Next available id= "+ n);

    }
}
