package com.ipap.springmongocacheabledata.service;

import com.ipap.springmongocacheabledata.entity.Department;
import com.ipap.springmongocacheabledata.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@EnableCaching
@EnableScheduling
public class DepartmentService {

    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Cacheable(value = "departments")
    public Optional<Department> getDepartmentByCode(String deptCode) {
        return departmentRepository.getDepartmentByCode(deptCode);
    }

    // Invalidator with timer
    // @Scheduled(fixedRate = 10000L)
    @CacheEvict(value = "departments", allEntries = true)
    public void clearCache() {

    }

    @CacheEvict(value = "departments", allEntries = true)
    public Optional<Department> addDepartment(Department department) {
        return Optional.of(departmentRepository.save(department));
    }

}
