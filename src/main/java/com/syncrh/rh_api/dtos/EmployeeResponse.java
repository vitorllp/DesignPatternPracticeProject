package com.syncrh.rh_api.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeResponse {
    private String cpf;
    private String name;
    private String position;
    private Float salary;
    private LocalDate hireDate;
    private LocalDate terminationDate;
}
