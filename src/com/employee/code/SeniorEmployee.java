package com.employee.code;

import java.util.*;
import java.util.stream.Collectors;

public class SeniorEmployee {
    public static void main(String[] args){
        List<Employee> employeeList = EmployeeList.getEmployeeList();

        //Who has the most working experience in the organization?
        Optional<Employee> mostWorkingExp = employeeList.stream().
                sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee seniorEmployee = mostWorkingExp.get();
        System.out.println("Senior Employee :"+ mostWorkingExp.get());

        //How many male and female employees are there in the sales and marketing team?
        Map<String,Long> noOfMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
                .filter(e->e.getDepartment()=="Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmployeesInSalesMarketing);
    }
}
