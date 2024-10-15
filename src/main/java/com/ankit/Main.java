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

class fullTimeEmployee extends Employee{
    private double monthlySalary;

    public fullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double CalculateEmployeeSalary() {
        return monthlySalary;
    }
}

class partTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public partTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double CalculateEmployeeSalary() {
        return hoursWorked*hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Working");
    }
}