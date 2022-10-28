package com.bridgelabz.day8_EmployeeWage;

import java.util.Random;


class Employee {

    //constant
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_DAY = 20;

    //generating random number between 0 to 2 using random function
    public static int empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(3);
        return empCheck;
    }

//calculating employee works hour and salary
    public static void empSalary(int empCheck) {
        int empWrkHrs;
        switch (empCheck) {

            case IS_FULL_TIME -> empWrkHrs = 8;
            case IS_PART_TIME -> empWrkHrs = 4;
            default -> empWrkHrs = 0;
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


