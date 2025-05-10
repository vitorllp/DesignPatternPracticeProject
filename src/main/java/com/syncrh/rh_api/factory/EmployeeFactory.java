package com.syncrh.rh_api.factory;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeBuilder;
import com.syncrh.rh_api.model.EmployeeType;

public class EmployeeFactory {
    public Employee createEmployee(EmployeeType type) {
        return switch (type) {
            case CLT -> new EmployeeBuilder()
                    .name("Default CLT")
                    .type(EmployeeType.CLT)
                    .salary(4000f)
                    .build();
            case PJ -> new EmployeeBuilder()
                    .name("Default PJ")
                    .type(EmployeeType.PJ)
                    .salary(8000f)
                    .build();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}
