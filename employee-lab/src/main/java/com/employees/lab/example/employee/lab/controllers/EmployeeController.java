package com.employees.lab.example.employee.lab.controllers;

import com.employees.lab.example.employee.lab.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.employees.lab.example.employee.lab.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired //declaring what repository(ies) we are using
    EmployeeRepository employeeRepo;

    //declaring http responses

    //save employee

    //Get All
    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    //Get One
    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getOneEmployeeByID(@PathVariable Long id){
        return employeeRepo.findById(id);
    }

    //
//    @GetMapping(value = "/employees/{id}")
//    public void updateEmployeeByID(@PathVariable Long id,Employee employee){
//
//        employeeRepo.save();
//    }




}


//    @GetMapping(value= "/pirates")
//    public List<Pirate> getAllPirates(){
//        return pirateRepository.findAll();
//    }