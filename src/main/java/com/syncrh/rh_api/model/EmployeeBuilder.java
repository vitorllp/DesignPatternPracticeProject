package com.syncrh.rh_api.model;

import java.time.LocalDate;

public class EmployeeBuilder {
    private String cpf;
    private String name;
    private String position;
    private Float salary;
    private LocalDate hireDate;
    private LocalDate terminationDate;
    private EmployeeType type;

    public EmployeeBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder position(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder salary(Float salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder hireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    public EmployeeBuilder terminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
        return this;
    }

    public EmployeeBuilder type(EmployeeType type) {
        this.type = type;
        return this;
    }

    public Employee build() {
        return new Employee(cpf, name, position, salary, hireDate, terminationDate, type);
    }
}
