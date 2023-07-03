package com.employees.lab.example.employee.lab.models;

import javax.persistence.*;

@Entity //declare entity
@Table(name="employees")
public class Employee {

    @Id //declaring primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID generation type

    //creating columns
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="employee_number")
    private Long employeeNumber;
    @Column(name="email",nullable = true)
    private String email;

    public Employee(){} //empty constructor for String

    public Employee(String name, int age, Long employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
