package com.employees.lab.example.employee.lab;

import com.employees.lab.example.employee.lab.models.Employee;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.employees.lab.example.employee.lab.repositories.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepo;

	@Before
	public void setUp(){
		employeeRepo.deleteAll();
	}
	@Test
	void contextLoads() {
	}

	@Test
	public void canAdd(){
		Employee employee = new Employee("Sandra",38, 1234L,"sandra@email.com");
		employeeRepo.save(employee);
	}

	@Test
	public void canDeleteByID(){
		Employee employee = new Employee("Sandra",38, 1234L,"sandra@email.com");

	}



}
