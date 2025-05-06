package com.syncrh.rh_api.dtos;

import com.syncrh.rh_api.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {
    public Employee toEntity(EmployeeRequest request) {
        return new Employee(
                request.getCpf(),
                request.getName(),
                request.getPosition(),
                request.getSalary(),
                request.getHireDate(),
                request.getTerminationDate()
        );
    }

    public EmployeeResponse toResponse(Employee employee) {
        return new EmployeeResponse(
                employee.getCpf(),
                employee.getName(),
                employee.getPosition(),
                employee.getSalary(),
                employee.getHireDate(),
                employee.getTerminationDate()
        );
    }

    public List<EmployeeResponse> toResponseList(List<Employee> employees) {
        return employees.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
