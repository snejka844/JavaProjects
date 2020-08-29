/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author eck
 */
class Employee {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.income, income) == 0 &&
                name.equals(employee.name) &&
                gender == employee.gender &&
                dob.equals(employee.dob) &&
                employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, dob, income, employeeId);
    }

    public static enum Gender {

        MALE, FEMALE
    }

    private String name;
    private Gender gender;
    private LocalDate dob;
    private double income;
    private UUID employeeId;
    private Employee(String name, Gender gender, LocalDate dob,
            double income) {
        
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.income = income;
    }

    public Employee() {
        employeeId = UUID.randomUUID();
    }

    public double getIncome() {
        return income;
    }

    public static List<Employee> persons() {
        Employee p1 = new Employee( "Jake", Gender.MALE, LocalDate.of(1971,
                Month.JANUARY, 1), 2343.0);
        Employee p2 = new Employee("Jack", Gender.MALE, LocalDate.of(1972,
                Month.JULY, 21), 7100.0);
        Employee p3 = new Employee( "Jane", Gender.FEMALE, LocalDate.of(1973,
                Month.MAY, 29), 5455.0);
        Employee p4 = new Employee("Jode", Gender.MALE, LocalDate.of(1974,
                Month.OCTOBER, 16), 1800.0);
        Employee p5 = new Employee( "Jeny", Gender.FEMALE, LocalDate.of(1975,
                Month.DECEMBER, 13), 1234.0);
        Employee p6 = new Employee( "Jason", Gender.MALE, LocalDate.of(1976,
                Month.JUNE, 9), 3211.0);

        List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return persons;
    }

    public static void statistics() {
        double sumofIncoms =0;
        for(int i = 0;i < persons().size();i++)
        {
            sumofIncoms = persons().get(i).income;
        }

        System.out.println(sumofIncoms);
    }

    @Override
    public String toString() {
        return String.format("Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", income=" + income +
                ", employeeId=" + employeeId +
                '}');
    }

    public void personsStatsByGenderCount()
    {
        List<Employee> maleGender = null;
        List<Employee> femaleGender = null;

        int countMale = 0;
        int countFemale = 0;

        for(int i =0 ;i<persons().size();i++)
        {
            if(Employee.persons().get(i).equals(gender.MALE))
            {
                maleGender.add(persons().get(i));
                countMale++;
            }
            else
            {
              //  femaleGender.add(persons().get(i));
                countFemale++;
            }

            System.out.println("Male group count"  + countMale  );
            System.out.println("Female group count"  + countFemale  );
        }
    }

    public void personsStatsByGenderList()
    {
        List<Employee> maleGender = null;
        List<Employee> femaleGender = null;



        for(int i =0 ;i<persons().size();i++)
        {
            if(Employee.persons().get(i).equals(gender.MALE))
            {
                maleGender.add(persons().get(i));

            }
            else
            {
                femaleGender.add(persons().get(i));

            }

            System.out.print("Male group" + maleGender);
            System.out.println("Female group " + femaleGender);
        }

}}

