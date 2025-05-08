package com.syncrh.rh_api.factory;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeType;

public class PJEmployeeCreator implements EmployeeCreator {
    @Override
    public Employee createEmployee() {
        Employee employee = new Employee();
        employee.setType(EmployeeType.PJ);
        return employee;
    }
}
