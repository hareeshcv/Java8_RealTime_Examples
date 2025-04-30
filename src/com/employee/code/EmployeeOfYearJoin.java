package com.employee.code;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeOfYearJoin {
    public static void main(String [] args){
        List<Employee> empList = EmployeeList.getEmployeeList();
        //Get the names of all employees who have joined after 2015?
        System.out.println("Emplyee Name's of after 2020 joined: ");
        empList.stream().filter(e->e.getYearOfJoining()>2020).map(Employee::getName)
                .forEach(System.out::println);
        //Count the number of employees in each department?
        Map<String, Long> eachDepartList = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String,Long>> entrySet = eachDepartList.entrySet();
        for(Map.Entry<String,Long> entry : entrySet){
            System.out.println(entry.getKey() +":" +entry.getValue());
        }
    }
}
