package com.CodeClan.example.employeetracker;

import com.CodeClan.example.employeetracker.models.Employee;
import com.CodeClan.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Mark", 32, 34, "email@email.com");
		employeeRepository.save(employee);
	}

}
