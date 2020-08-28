package com;

public class Employee {
    public static String ID;
    private String name;
    private double salary;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name==null? "No Name":name;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary<0 ? 1000: salary;
    }

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return String.format("ID: %s , Name: %s , Salary: %.2f", ID,getName(),getSalary());
    }
}
