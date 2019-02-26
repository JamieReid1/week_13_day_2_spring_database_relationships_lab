package com.example.RelationshipsLab.controllers;


import com.example.RelationshipsLab.models.Employee;
import com.example.RelationshipsLab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    private List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping("delete/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }

}
