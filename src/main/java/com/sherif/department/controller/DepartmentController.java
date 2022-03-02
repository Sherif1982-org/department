package com.sherif.department.controller;


import com.sherif.department.DepartmentApplication;
import com.sherif.department.entity.Department;
import com.sherif.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable ("id") Long id){

        return departmentService.findDepartmentById(id);
    }


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department ){

        log.info("Trying to save department");
        return departmentService.saveDepartment(department);
    }

}
