package com.bridgelabz.employee_management_using_classes_2;

import java.util.Random;

public class EmployeeManagementUsingClasses2 {

//UC6
/*Calculate Wages till
a condition of total
working hours or
days is reached for
a month - Assume 100 hours and 20 days*/
    public static void employeeWage(){
        int salary =0;
        int fullDayHrs=8;
        int wagePerHour=20;
        int partTimeHours=4;
        int totalWorkingDays=20;
        int workingDays=0;
        int workingHours=0;
        int maxWorkingHours=100;
        int monthlySalary=0;
        int empHrs=0;
        Random random = new Random();

        while (workingDays <=totalWorkingDays && workingHours<=maxWorkingHours){
        int attendance = random.nextInt(3);
        switch (attendance){
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                System.out.println("Employee is present full-time.");
                empHrs=fullDayHrs;
                salary=empHrs*wagePerHour;
                System.out.println("Daily wage: "+ salary);
                break;
            case 2:
                System.out.println("Employee is present part-time. ");
                empHrs=partTimeHours;
                salary=empHrs*wagePerHour;
                System.out.println("Daily wage: "+ salary);

        }
            monthlySalary+=salary;
            workingHours+=empHrs;
            workingDays++;
    }

        System.out.println("Monthly salary: "+ monthlySalary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes 2");


        employeeWage();

    }
}
