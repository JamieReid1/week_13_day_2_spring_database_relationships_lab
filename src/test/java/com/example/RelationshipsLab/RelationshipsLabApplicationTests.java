package com.example.RelationshipsLab;

import com.example.RelationshipsLab.models.Department;
import com.example.RelationshipsLab.models.Employee;
import com.example.RelationshipsLab.models.Project;
import com.example.RelationshipsLab.repositories.DepartmentRepository;
import com.example.RelationshipsLab.repositories.EmployeeRepository;
import com.example.RelationshipsLab.repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddDepartment(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);
	}

	@Test
	public void canAddEmployee(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);
		Employee employee = new Employee("Joe", "Bloggs", 1, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canDeleteEmployee(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Joe", "Bloggs", 1, department);
		Employee employee2 = new Employee("Jack", "Smith", 2, department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

	@Test
	public void canAddProject(){
		Project project = new Project("Lab", 1);
		projectRepository.save(project);
	}

	@Test
	public void canAddProjectToEmployee(){
		Department department = new Department("CodeClan");
		departmentRepository.save(department);

		Employee employee = new Employee("Joe", "Bloggs", 1, department);
		employeeRepository.save(employee);

		Project project = new Project("Lab", 1);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

		employee.addProject(project);
		employeeRepository.save(employee);
	}


}
