package com.ipap.springmongocacheabledata.repository;

import com.ipap.springmongocacheabledata.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DepartmentRepository extends MongoRepository<Department, String> {

    Optional<Department> getDepartmentByCode(String code);
}
