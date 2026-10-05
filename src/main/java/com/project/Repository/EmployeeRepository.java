package com.project.Repository;

import com.project.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private final List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee saved dto DB");
    }

    public List<Employee> findAll(){
        return employees;
    }
}
