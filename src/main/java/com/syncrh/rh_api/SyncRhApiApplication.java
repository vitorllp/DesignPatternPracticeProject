package com.syncrh.rh_api;

import com.sun.tools.javac.Main;
import com.syncrh.rh_api.factory.EmployeeFactory;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SyncRhApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SyncRhApiApplication.class, args);

		Employee cltEmployee = EmployeeFactory.createEmployee(
				EmployeeType.CLT,
				"João Silva",
				"Developer",
				5000.00f,
				LocalDate.of(2023, 1, 15) // Hire date
		);
		System.out.println("Employee type: " + cltEmployee.getType());
		System.out.println("Name: " + cltEmployee.getName());
		System.out.println("Position: " + cltEmployee.getPosition());
		System.out.println("Salary: " + cltEmployee.getSalary());
		System.out.println("Hire date: " + cltEmployee.getHireDate());
	}

}
