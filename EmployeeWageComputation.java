package com.bridgelabz.day8_EmployeeWage;

import java.util.Random;

class Employee {

    //constant
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_DAY = 20;
    static final int WORKING_DAY_PER_MONTH = 20;


    //generating random number between 0 to 2 using random function
    public static int empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(3);
        return empCheck;
    }

    //calculating employee works hour and salary
    public static int empSalary(int empCheck) {
        int empWrkHrs;
        switch (empCheck) {

            case IS_FULL_TIME -> empWrkHrs = 8;
            case IS_PART_TIME -> empWrkHrs = 4;
            default -> empWrkHrs = 0;
        }

        int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
        return empWage;
    }

    //calculating total employee salary
    public static int totalEmpSalary() {
        int day = 0;
        int totalEmpSalary = 0;
        int empWage;
        int empCheck;

        while (day < WORKING_DAY_PER_MONTH) {
            empCheck = empCheck();
            empWage = empSalary(empCheck);
            day++;
            totalEmpSalary += empWage;

        }
        return totalEmpSalary;
    }

}
public class EmployeeWageComputation {

    public static void main(String[] args) {

        int totalEmpSalary;
        totalEmpSalary = Employee.totalEmpSalary();
        System.out.println("Total Employee salary : " + totalEmpSalary);
    }

}


