package com.ipap.springmongocacheabledata.repository;

import com.ipap.springmongocacheabledata.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
