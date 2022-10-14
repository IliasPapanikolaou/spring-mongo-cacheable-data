package com.ipap.springmongocacheabledata;

import com.ipap.springmongocacheabledata.entity.Department;
import com.ipap.springmongocacheabledata.entity.Employee;
import com.ipap.springmongocacheabledata.repository.DepartmentRepository;
import com.ipap.springmongocacheabledata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringMongoCacheableDataApplication implements CommandLineRunner {


    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public SpringMongoCacheableDataApplication(
            EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoCacheableDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Employee employee1 = new Employee("Maria", "HR");
//        Employee employee2 = new Employee("Giannis", "Dev");
//        Employee employee3 = new Employee("George", "SD");
//        Employee employee4 = new Employee("Anna", "PMO");
//        Employee employee5 = new Employee("Kostas", "BA");
//
//        Department dept1 = new Department("Human Resources", "HR");
//        Department dept2 = new Department("Application Developers", "Dev");
//        Department dept3 = new Department("Support Desk", "SD");
//        Department dept4 = new Department("Project Management Office", "PMO");
//        Department dept5 = new Department("Business Analysts", "BA");
//
//        employeeRepository.saveAll(List.of(employee1, employee2, employee3, employee4, employee5));
//        departmentRepository.saveAll(List.of(dept1, dept2, dept3, dept4, dept5));

//        Employee employee6 = new Employee("Mario", "TD");
//        employeeRepository.save(employee6);
    }
}
