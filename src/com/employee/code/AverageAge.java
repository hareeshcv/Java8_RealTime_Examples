package com.employee.code;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args){

        List<Employee> list = EmployeeList.getEmployeeList();
        // What is the average age of male and female employees?
        Map<String, Double> averageAge= list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAge);

        //Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmployeeWraper =
                list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
                Employee highiestPaidEmployee = highestPaidEmployeeWraper.get();
                System.out.println("Employee Details:......");
                System.out.println("Employee Id: "+ highiestPaidEmployee.getId());
                System.out.println("Employee name: " + highiestPaidEmployee.getName());
                System.out.println("Employee Age: " + highiestPaidEmployee.getAge());
                System.out.println("Employee Gender: " + highiestPaidEmployee.getGender());
                System.out.println("Employee Department: " + highiestPaidEmployee.getDepartment());
                System.out.println("Employee Joining Year: "+highiestPaidEmployee.getYearOfJoining());
                System.out.println("Employee Salary: " + highiestPaidEmployee.getSalary());
    }
}
