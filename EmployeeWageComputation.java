package com.bridgelabz.day8_EmployeeWage;

import java.util.Random;

class Employee {
    //constant
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_PER_HOUR = 20;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int TOTAL_WRK_HRS_MONTH = 100;


    //generating random number between 0 to 2 using random function
    public static int empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(3);
        return empCheck;
    }

    //calculating employee works hour and salary
    public static int empWrkHrs(int empCheck) {
        int empWrkHrs;
        switch (empCheck) {

            case IS_FULL_TIME -> empWrkHrs = 8;
            case IS_PART_TIME -> empWrkHrs = 4;
            default -> empWrkHrs = 0;
        }
            return empWrkHrs;
    }

    //calculating employee wage per day
    public static int empWage(int empWrkHrs){
        int empWage = empWrkHrs * EMP_WAGE_PER_HOUR;
        return empWage;
}


    //calculating total employee salary
    public static int totalEmpSalary() {
        int day = 0;
        int totalEmpSalary = 0;
        int empWrkHrs;
        int empWage ;
        int empCheck ;
        int totalEmpWrkHrs =0;

    while ( day < WORKING_DAY_PER_MONTH && totalEmpWrkHrs < TOTAL_WRK_HRS_MONTH ) {
            empCheck = empCheck();
            empWrkHrs = empWrkHrs(empCheck);
            empWage = empWage(empWrkHrs);
            totalEmpWrkHrs += empWrkHrs;
            day++;
            totalEmpSalary += empWage;
        System.out.println("Day :" +day+" Hours : "+empWrkHrs+ " Salary : "+empWage ); 
     

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


