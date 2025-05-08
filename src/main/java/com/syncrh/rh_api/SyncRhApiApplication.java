package com.syncrh.rh_api;

import com.sun.tools.javac.Main;
import com.syncrh.rh_api.dtos.EmployeeRequest;
import com.syncrh.rh_api.factory.EmployeeFactory;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeBuilder;
import com.syncrh.rh_api.model.EmployeeType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SyncRhApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SyncRhApiApplication.class, args);

		//--------------- Factory test
		EmployeeFactory factory = new EmployeeFactory();

		Employee pjEmployee = factory.createEmployee(EmployeeType.PJ);

		System.out.println(pjEmployee);

		//--------------- Builder test
		Employee cltEmployee = new EmployeeBuilder()
				.cpf("12345678900")
				.name("Maria")
				.position("Developer")
				.salary(5000f)
				.hireDate(LocalDate.of(2023, 1, 10))
				.terminationDate(null) // Não possui data de término
				.type(EmployeeType.CLT)
				.build();

		System.out.println(cltEmployee);
	}

}
