package com.bridgelabz.employee_management_using_classes_2;

import java.util.Random;

class Company{
    private final String name;
    private final int wagePerHour;
    private final int totalWorkingDays;
    private final int maxWorkingHours;

    public Company(String name, int wagePerHour, int totalWorkingDays, int maxWorkingHours){
        this.name=name;
        this.wagePerHour=wagePerHour;
        this.totalWorkingDays=totalWorkingDays;
        this.maxWorkingHours=maxWorkingHours;
    }
    public String getName(){
        return name;
    }
    public int getWagePerHour(){
        return wagePerHour;
    }
    public int getTotalWorkingDays(){
        return totalWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }
}
public class EmployeeManagementUsingClasses2 {

//UC8
/*Refactor the Code
to Compute Employee Wage
for multiple companies - Note: Each Company has its own
wage, number of working days
and working hours per month
- Use Class Method with function
parameters instead of Class
Variables*/
    private static final int fullDayHrs = 8;
    private static final int partTimeHours=4;
    public static int employeeWage(Company company){
        int salary =0;
        int workingDays=0;
        int workingHours=0;
        int monthlySalary=0;
        int empHrs=0;
        Random random = new Random();

        while (workingDays <= company.getTotalWorkingDays() && workingHours<= company.getMaxWorkingHours()){
        int attendance = random.nextInt(3);
        switch (attendance){
            case 0:
                System.out.println("Employee is absent for "+ company.getName());
                break;
            case 1:
                System.out.println("Employee is present full-time for "+ company.getName());
                empHrs=fullDayHrs;
                salary=empHrs* company.getWagePerHour();
                System.out.println("Daily wage: "+ salary);
                break;
            case 2:
                System.out.println("Employee is present part-time for "+ company.getName());
                empHrs=partTimeHours;
                salary=empHrs*company.getWagePerHour();
                System.out.println("Daily wage: "+ salary);

        }
            monthlySalary+=salary;
            workingHours+=empHrs;
            workingDays++;
    }

        System.out.println("Monthly salary for : "+company.getName()+" is: "+ monthlySalary);
        return monthlySalary;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes 2");
        Company company1 =new Company("ABC",20,20,100);
        Company company2 =new Company("PQRS",19,20,101);


        employeeWage(company1);
        System.out.println("------------------------------");
        employeeWage(company2);

    }
}
