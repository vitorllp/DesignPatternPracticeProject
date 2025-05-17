package com.syncrh.rh_api.model;

import java.time.LocalDate;

public class NullEmployee extends Employee {
    public NullEmployee() {
        super("No employee");
        setPosition("N/A");
        setSalary(0.0f);
        setHireDate(null);
        setTerminationDate(null);
        setType(EmployeeType.NONE);
    }

    @Override
    public String toString() {
        return "NullEmployee: no employee data.";
    }

    @Override
    public String getPosition() {
        return "N/A";
    }

    @Override
    public Float getSalary() {
        return 0.0f;
    }

    @Override
    public LocalDate getHireDate() {
        return null;
    }
}
