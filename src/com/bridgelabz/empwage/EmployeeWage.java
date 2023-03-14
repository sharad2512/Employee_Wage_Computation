package com.bridgelabz.empwage;
public class EmployeeWage {
    public void employeeWage(){
        final int empWagePerHrs = 20;
        final int WORKING_DAYS_IN_MONTH = 20;
        final int MAX_HRS_IN_MONTH = 100;
        final int IS_FULL_TIME = 2;
        final int IS_PART_TIME = 1;
        int empHrs;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays <= WORKING_DAYS_IN_MONTH) {
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
            totalEmployeeHrs = empHrs + totalEmployeeHrs;
            System.out.println("Day:" + totalWorkingDays + " EmpHour: " + empHrs);
        }
        int totalEmployeeWage = totalEmployeeHrs * empWagePerHrs;
        System.out.println("Total Employee Wage " + totalEmployeeWage);
    }
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeWage();
    }
}