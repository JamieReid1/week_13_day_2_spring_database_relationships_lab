package com.example.RelationshipsLab;

import com.example.RelationshipsLab.models.Employee;
import com.example.RelationshipsLab.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddEmployee(){
		Employee employee = new Employee("Joe", "Bloggs", 1);
		employeeRepository.save(employee);
	}

	@Test
	public void canDeleteEmployee(){
		Employee employee1 = new Employee("Joe", "Bloggs", 1);
		Employee employee2 = new Employee("Jack", "Smith", 2);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

}
