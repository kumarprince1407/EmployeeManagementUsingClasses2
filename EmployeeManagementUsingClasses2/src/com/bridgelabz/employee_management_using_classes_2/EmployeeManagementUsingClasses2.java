package com.bridgelabz.employee_management_using_classes_2;

import java.util.Random;

public class EmployeeManagementUsingClasses2 {

//UC2
    public static void employeeWage(){
        int salary =0;
        int fullDayHrs=8;
        int wagePerHour=20;
        Random random = new Random();
        int attendance = random.nextInt(2);
        switch (attendance){
            case 0:
                System.out.println("Employee is absent.");
                break;
            case 1:
                System.out.println("Employee is present.");
                salary=fullDayHrs*wagePerHour;
                System.out.println("Daily wage: "+ salary);
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes 2");


        employeeWage();

    }
}
