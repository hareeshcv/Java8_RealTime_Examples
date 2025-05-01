package com.employee.code;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133,"Hareesh C",31,"Male","Software Developer",2021,5000.00));
        employeeList.add(new Employee(144,"Rakesh",32,"Male","Java Developer",2014,100000.00));
        employeeList.add(new Employee(1223,"Monika",31,"Female","Assistant",2025,30000.00));
        employeeList.add(new Employee(123,"Lavanya",30,"Female","Developer",2018,100000.00));
        employeeList.add(new Employee(145,"Venkat",31,"Male","Senior developer",2022,500000.00));
        employeeList.add(new Employee(131,"Kranthi",29,"Male","Devops Engineer",2021,120000.00));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(244, "Daniel", 24, "Female", "Sales And Marketing", 2018, 10703.5));

        return employeeList;
    }
}