package com.project.Service;

import com.project.Repository.EmployeeRepository;
import com.project.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee) {
        System.out.println("Adding Employee...");
        employeeRepository.saveEmployee(employee);
    }

    public void displayEmployee() {

        List<Employee> employees =
                employeeRepository.findAll();

        System.out.println("Employee List");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}