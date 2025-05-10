package com.syncrh.rh_api;

import com.syncrh.rh_api.facade.EmployeeFacade;
import com.syncrh.rh_api.factory.EmployeeFactory;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeBuilder;
import com.syncrh.rh_api.model.EmployeeType;
import com.syncrh.rh_api.strategy.SalaryStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SyncRhApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SyncRhApiApplication.class, args);

		// -------------- Facade test
		EmployeeFacade employeeFacade = new EmployeeFacade();
		employeeFacade.registerCltEmployee("12345678900","Maria","Developer", 5000);
		employeeFacade.generateSimpleReport();
		//--------------- Strategy test
		SalaryStrategy strategy = new SalaryStrategy.Clt();
		float salary = strategy.calculateEmployeeSalary(5000);
		System.out.println("New Salary:" + salary);
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
				.terminationDate(null)
				.type(EmployeeType.CLT)
				.build();
		System.out.println(cltEmployee);
	}

}
