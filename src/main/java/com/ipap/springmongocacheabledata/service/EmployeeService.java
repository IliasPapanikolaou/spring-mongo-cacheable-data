package com.ipap.springmongocacheabledata.service;

import com.ipap.springmongocacheabledata.entity.Department;
import com.ipap.springmongocacheabledata.entity.Employee;
import com.ipap.springmongocacheabledata.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeService {

    private final DepartmentService departmentService;
    private final EmployeeRepository employeeRepository;

    public EmployeeService(DepartmentService departmentService, EmployeeRepository employeeRepository) {
        this.departmentService = departmentService;
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.stream()
                .peek(employee -> departmentService.getDepartmentByCode(
                        employee.getCode()).ifPresent(employee::setDepartment)
                ).toList();
    }
}
