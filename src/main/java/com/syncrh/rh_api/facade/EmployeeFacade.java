package com.syncrh.rh_api.facade;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeBuilder;
import com.syncrh.rh_api.model.EmployeeType;

import java.time.LocalDate;

public class EmployeeFacade {
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

    public void generateSimpleReport() {
        System.out.println("=== Employee report ===");
        Employee clt = registerCltEmployee("12345678900", "Maria", "Developer", 5000f);
        System.out.println(clt);
    }
}
