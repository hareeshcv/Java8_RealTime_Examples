package com.employee.code;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpListDepart {
    public static void main(String [] args){
        List<Employee> employeeList = EmployeeList.getEmployeeList();
        //List down the names of all employees in each department?
        Map<String,List<Employee>> employeeListDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String,List<Employee>>> entrySet = employeeListDepartment.entrySet();
        for(Map.Entry<String,List<Employee>> entry : entrySet){
            System.out.println("--------------------------------");
            System.out.println("Employees In " + entry.getKey() + ":" );
            System.out.println("--------------------------------");
            List<Employee> empList = entry.getValue();
            for(Employee e : empList){
                System.out.println(e.getName());
            }
        }
        System.out.println();
        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics empAvgTotalSalary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary :" + empAvgTotalSalary.getAverage());
        System.out.println("Employees Total Salary:"+ empAvgTotalSalary.getSum());

    }
}
