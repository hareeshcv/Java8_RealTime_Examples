package com.employee.code;

import java.util.*;
import java.util.stream.Collectors;

public class AverageSalary {
    public static void main(String[] args){
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        //What is the average salary of each department?
        Map<String, Double> avgSalaryOfDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String,Double>> entrySet = avgSalaryOfDepart.entrySet();
        System.out.println("Average salary Each Department: .....");
        for(Map.Entry<String,Double> entry : entrySet){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
        //Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestEmployeeProductDevelopment =
                employeeList.stream().filter(e->e.getGender()=="Male" && e.getDepartment()=="Product Development").
                        min(Comparator.comparingInt(Employee::getAge));
        Employee youngestEmployee = youngestEmployeeProductDevelopment.get();
        System.out.println("Get the All List of Youngest Employees for product development....");
        System.out.println("Employee Id: " + youngestEmployee.getId());
        System.out.println("Name: "+ youngestEmployee.getName());
        System.out.println("Gender : " + youngestEmployee.getGender());
        System.out.println("Department :"+ youngestEmployee.getDepartment());
        System.out.println("YearOfJoining : " + youngestEmployee.getYearOfJoining());
        System.out.println("Salary : "+ youngestEmployee.getSalary());
        System.out.println();

        //What is the average salary of male and female employees?
        Map<String,Double> averageSalaryMaleFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary of Male and Female.....");
        System.out.println(averageSalaryMaleFemale);
    }
}
