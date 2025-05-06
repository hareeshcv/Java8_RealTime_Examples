package com.employee.code;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemaleEmpList {
    public static void main(String[] args){

        //How many male and female employees are there in the organization?
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        Map<String, Long> maleFemaleList = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Male And Female count: "+ maleFemaleList);

        //Print the name of all departments in the organization?
         employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);


    }
}
