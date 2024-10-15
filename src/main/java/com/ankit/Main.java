package com.ankit;


abstract class Employee{
    private String name;
    private int id;
    public Employee(String name , int id) {
        this.id = id;
        this.name=name;
    }
    public String getName (){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double CalculateEmployeeSalary();

    @Override
    public String toString(){
        return "Employee [name = "+name+" , id= "+ id+", Salary = "+CalculateEmployeeSalary()+" ]";
    }
}
public class Main {
    public static void main(String[] args) {
    }
}