package com.bridgelabz.empwage;
public class EmployeeWage {
    public static void main(String[] args) {
        final int WAGE_PER_HRS = 20;
        final int WORKING_HRS = 8;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            dailyWage = WORKING_HRS * WAGE_PER_HRS;
            System.out.println("Employee is present ");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Employee Wage is "+dailyWage);
    }
}