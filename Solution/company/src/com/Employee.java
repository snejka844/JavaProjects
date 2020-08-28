package com;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public Employee(Employee rhs) {
        this(rhs.name, rhs.salary);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name == null ? "No Name" : name;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary < 0 ? 1000 : salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", name, salary);
    }
}
