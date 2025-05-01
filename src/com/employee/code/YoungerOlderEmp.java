package com.employee.code;

import java.util.*;
import java.util.stream.Collectors;

public class YoungerOlderEmp {
    public static void main(String [] args){
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> listOfYoungerOlderEmp = employeeList.stream()
                .collect(Collectors.partitioningBy(e->e.getAge()>25));
        Set<Map.Entry<Boolean,List<Employee>>> entrySet = listOfYoungerOlderEmp.entrySet();
        for(Map.Entry<Boolean,List<Employee>> entry: entrySet){
            System.out.println("--------------------------------");
            if(entry.getKey()){
                System.out.println("Employee Older than 25 : ");
            }else {
                System.out.println("Employee Age equal or younger than 25 :");
            }
            List<Employee> list = entry.getValue();
            for(Employee l : list){
                System.out.println(l.getName());
            }
        }

        // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmployee = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        Employee list = oldestEmployee.get();
        System.out.println("----------------------------------");
        System.out.println("Oldest Employee Name :" + list.getName());
        System.out.println("Oldest Employee Age :" + list.getAge());
        System.out.println("Oldest Employee department :"+ list.getDepartment());


    }
}
