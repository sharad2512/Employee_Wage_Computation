package com.bridgelabz.empwage;
public class EmployeeWage {
    public static void main(String[] args) {
        final int WAGE_PER_HRS = 20;
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int empWage = 0;
        int empHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == 1) {
            System.out.println("Employee worked as part time");
            empHrs = 4;
        } else if (empCheck == 2) {
            System.out.println("Employee worked as full time ");
            empHrs = 8;
        } else {
            System.out.println("Employee is absent");
        }
        empWage = empHrs * WAGE_PER_HRS;
        System.out.println("Employee Wage Is " + empWage);
    }
}