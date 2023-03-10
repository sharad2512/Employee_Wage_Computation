package com.bridgelabz.empwage;

public class EmployeeWage {
    public static void main(String[] args) {
        final int WAGE_PER_HRS = 20;
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int NUM_OF_WORKING_DAY = 20;
        int empWage = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        int empCheck = 0;
        for (int day = 1; day <= NUM_OF_WORKING_DAY; day++) {
            empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * WAGE_PER_HRS;
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Employee Wage Is " + totalEmpWage);
    }
}