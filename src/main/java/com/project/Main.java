package com.project;

import com.project.Service.EmployeeService;
import com.project.config.AppConfig;
import com.project.config.ApplicationInfo;
import com.project.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ApplicationInfo applicationInfo =
                context.getBean(ApplicationInfo.class);

        applicationInfo.displayInfo();

        EmployeeService employeeService =
                context.getBean(EmployeeService.class);

        Employee employee1 =
                new Employee(1, "Neeraj", "Aeroline");

        Employee employee2 =
                new Employee(2, "Ayush", "UK");

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);

        employeeService.displayEmployee();
    }
}