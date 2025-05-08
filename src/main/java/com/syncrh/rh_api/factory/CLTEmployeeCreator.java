package com.syncrh.rh_api.factory;

import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.EmployeeType;

public class CLTEmployeeCreator implements EmployeeCreator {
    @Override
    public Employee createEmployee() {
        Employee employee = new Employee();
        employee.setType(EmployeeType.CLT);
        return employee;
    }
}
