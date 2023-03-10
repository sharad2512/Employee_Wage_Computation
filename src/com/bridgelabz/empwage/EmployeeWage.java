package com.bridgelabz.empwage;

public class EmployeeWage {
    public static void main(String[] args) {
        final int WAGE_PER_HRS = 20;
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        int empWage = 0;
        int empHrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
                break;
        }
        empWage = empHrs * WAGE_PER_HRS;
        System.out.println("Employee Wage Is " + empWage);
    }
}