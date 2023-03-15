package com.bridgelabz.empwage;

public class EmployeeWage {
    public static  final int IS_PART_TIME = 1;
    public static  final int IS_FULL_TIME = 2;
    public static int employeeWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        System.out.println("Welcome to Employee Wage Program");
        int empHrs = 0;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= maxHrsPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
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
            }
            totalEmployeeHrs = totalEmployeeHrs + empHrs;
            System.out.println("Day:" + totalWorkingDays + " EmpHour: " + empHrs);
        }
        int totalEmployeeWage = totalEmployeeHrs * empRatePerHr;
        System.out.println("Total Employee Wage For Company : " + company + " is: " + totalEmployeeWage);
        return totalEmployeeWage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeWage("TCS",10,4,20);
        employeeWage.employeeWage("Wipro",200,4,30);
    }
}