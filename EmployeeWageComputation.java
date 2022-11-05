package com.bridgelabz.day8_EmployeeWage;

import java.util.Random;

public class EmployeeWageComputation {
    //constant
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

 // constructer


 public EmployeeWageComputation(String company, int empRatePerHour , int numOfWorkingDays , int maxHoursPerMonth)
 {
     this.company = company;
     this.empRatePerHour = empRatePerHour;
     this.numOfWorkingDays = numOfWorkingDays;
     this.maxHoursPerMonth = maxHoursPerMonth;
 }

 public static void totalEmpWage() {

     EmployeeWageComputation dMart = new EmployeeWageComputation("dmart", 20 , 20 , 100);

 Random random = new Random();
 int totalWorkingDays = 0 ;
 int totalWorkingHours = 0 ;
 int empWage = 0 ;
 int totalEmpWage = 0;

while (totalWorkingDays < dMart.numOfWorkingDays && totalWorkingHours < dMart.maxHoursPerMonth){
    totalWorkingDays++;
    int empCheck = random.nextInt(3);
    int empHrs = 0;
    switch( empCheck ){

        case IS_PART_TIME -> empHrs = 4 ;
        case IS_FULL_TIME -> empHrs = 8 ;
        default -> empHrs = 0 ;
    }
    totalWorkingHours = empHrs + totalWorkingHours ;
    empWage = empHrs * dMart.empRatePerHour;
    System.out.println("Day "+totalWorkingDays+ " = "+empWage );
    totalEmpWage = empWage + totalEmpWage ;
}
     System.out.println("Salary of "+dMart.company+" employee is "+totalEmpWage);

 }


public static void main(String[] args) {

     totalEmpWage();
    }
}


