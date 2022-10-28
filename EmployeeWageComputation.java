package com.bridgelabz.day8_EmployeeWage;

import java.util.Random;


class Employee {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_DAY = 20;

    public static int empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(3);
        return empCheck;
    }


    public static void empSalary(int empCheck) {
        int empWrkHrs = 0;
        if (empCheck == IS_FULL_TIME) {
            empWrkHrs = 8;
        } else if (empCheck == IS_PART_TIME) {
            empWrkHrs = 4;
        } else {
            empWrkHrs = 0;
        }
        int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
        System.out.println("Employee Wage = " + empWage);
    }

}


public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int empCheck = Employee.empCheck();
        Employee.empSalary(empCheck);

    }

}


