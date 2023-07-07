package com.bridgelabz.employee_management_using_classes_2;

import java.util.Random;

public class EmployeeManagementUsingClasses2 {

//UC5
/*Calculating Wages
for a Month
- Assume 20 Working Day per Month*/
    public static void employeeWage(){
        int salary =0;
        int fullDayHrs=8;
        int wagePerHour=20;
        int partTimeHours=4;
        int totalWorkingDays=20;
        int workingDays=0;
        int monthlySalary=0;
        Random random = new Random();

        while (workingDays <=totalWorkingDays){
        int attendance = random.nextInt(3);
        switch (attendance){
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                System.out.println("Employee is present full-time.");
                salary=fullDayHrs*wagePerHour;
                System.out.println("Daily wage: "+ salary);
                break;
            case 2:
                System.out.println("Employee is present part-time. ");
                salary=partTimeHours*wagePerHour;
                System.out.println("Daily wage: "+ salary);



        }
            monthlySalary+=salary;
            workingDays++;
    }

        System.out.println("Monthly salary: "+ monthlySalary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes 2");


        employeeWage();

    }
}
