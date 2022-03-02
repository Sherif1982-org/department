package com.sherif.department.respositry;

import com.sherif.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface DepartmentRepositry extends JpaRepository<Department, Long> {


    Department findByDepartmentId(Long id);
}
