package com.syncrh.rh_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(nullable = false, unique = true, length = 11)
    @NotNull(message = "Cpf cannot be null")
    @Pattern(regexp = "\\d{11}", message = "The CPF must have exactly 11 numeric digits")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "Name cannot be null or empty")
    @Size(min = 3, max = 255, message = "The name must be between 3 and 255 characters")
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "Position cannot be empty or null")
    private String position;

    @Column(nullable = false)
    @NotNull(message = "Salary cannot be null")
    @DecimalMin(value = "1000.00", inclusive = false, message = "The salary must be greater than 1000.00")
    private Float salary;

    @Column(nullable = false)
    @NotNull(message = "HireDate cannot be null")
    private LocalDate hireDate;

    @Column
    private LocalDate terminationDate;
}
