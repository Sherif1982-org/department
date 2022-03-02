package com.sherif.department.service;

import com.sherif.department.entity.Department;
import com.sherif.department.respositry.DepartmentRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepositry departmentRepositry;

    public Department findDepartmentById(Long id) {
        return departmentRepositry.findByDepartmentId(id);
    }

    public Department saveDepartment(Department department) {
        return departmentRepositry.save(department);
    }
}
