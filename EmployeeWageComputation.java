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

    // Constructor

    public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        super();
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void totalEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        Random random = new Random();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            int empHrs = 0;
            switch (empCheck) {

                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
                default -> empHrs = 0;
            }
            totalWorkingHours = empHrs + totalWorkingHours;
            empWage = empHrs * empRatePerHour;
            System.out.println("Day " + totalWorkingDays + " = " + empWage);
            totalEmpWage = empWage + totalEmpWage;
        }
        System.out.println("Salary of " + company + " employee is " + totalEmpWage);

    }

    public static void main(String[] args) {

        EmployeeWageComputation wipro = new EmployeeWageComputation("wipro", 20, 25, 100);
        wipro.totalEmpWage(wipro.company, wipro.empRatePerHour, wipro.numOfWorkingDays, wipro.maxHoursPerMonth);

        EmployeeWageComputation dMart = new EmployeeWageComputation("dmart", 20, 20, 100);
        dMart.totalEmpWage(dMart.company, dMart.empRatePerHour, dMart.numOfWorkingDays, dMart.maxHoursPerMonth);

    }
}


