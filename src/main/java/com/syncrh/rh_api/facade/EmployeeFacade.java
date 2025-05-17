package com.syncrh.rh_api.facade;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeBuilder;
import com.syncrh.rh_api.model.EmployeeType;
import com.syncrh.rh_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EmployeeFacade {
    @Autowired
    private EmployeeService employeeService;

    public Employee registerCltEmployee(String cpf, String name, String position, float salary) {
        Employee clt = new EmployeeBuilder()
                .cpf(cpf)
                .name(name)
                .position(position)
                .salary(salary)
                .hireDate(LocalDate.now())
                .type(EmployeeType.CLT)
                .build();

        System.out.println("Registered employee: " + clt);
        return clt;
    }

    public Employee findEmployeeByCpf(String cpf) {
        return employeeService.findByCpf(cpf);
    }

    public void generateSimpleReport() {
        System.out.println("=== Employee report ===");
        Employee clt = registerCltEmployee("12345678900", "Maria", "Developer", 5000f);
        System.out.println(clt);
    }
}
