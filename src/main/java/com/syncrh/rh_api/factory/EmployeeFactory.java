package com.syncrh.rh_api.factory;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeType;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private final Map<EmployeeType, EmployeeCreator> creators;

    public EmployeeFactory() {
        creators = new HashMap<>();
        creators.put(EmployeeType.CLT, new CLTEmployeeCreator());
        creators.put(EmployeeType.PJ, new PJEmployeeCreator());
    }

    public Employee createEmployee(EmployeeType type) {
        EmployeeCreator creator = creators.get(type);
        if (creator == null) {
            throw new IllegalArgumentException("Employee type not found: " + type);
        }
        return creator.createEmployee();
    }
}
