package com.ipap.springmongocacheabledata.controller;

import com.ipap.springmongocacheabledata.entity.Department;
import com.ipap.springmongocacheabledata.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return ResponseEntity.of(departmentService.addDepartment(department));
    }
}
