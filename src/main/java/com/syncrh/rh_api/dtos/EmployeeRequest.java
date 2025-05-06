package com.syncrh.rh_api.dtos;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeRequest {
    @NotNull(message = "Cpf cannot be null")
    @Pattern(regexp = "\\d{11}", message = "The CPF must have exactly 11 numeric digits")
    private String cpf;

    @NotBlank(message = "Name cannot be null or empty")
    @Size(min = 3, max = 255, message = "The name must be between 3 and 255 characters")
    private String name;

    @NotBlank(message = "Position cannot be empty or null")
    private String position;

    @NotNull(message = "Salary cannot be null")
    @DecimalMin(value = "1000.00", inclusive = false, message = "The salary must be greater than 1000.00")
    private Float salary;

    @NotNull(message = "HireDate cannot be null")
    private LocalDate hireDate;

    private LocalDate terminationDate;
}
