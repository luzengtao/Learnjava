package com.luzengtao.lesson4Test;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];

        employees[0] = new Employee("Tom",5000,1992,12,15);
        employees[1] = new Employee("Jerry",4500,1992,11,20);
        employees[2] = new Employee("JIN",5500,1992,8,30);

        for (Employee e:employees){
            e.raiseSalary(5);
        }
        for (Employee e:employees){
            System.out.println("name: "+ e.getName() +"salary: "+e.getSalary() +"hireDay: "+ e.getHireDay());
        }

    }
}
