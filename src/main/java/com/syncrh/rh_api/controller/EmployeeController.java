package com.syncrh.rh_api.controller;

import com.syncrh.rh_api.dtos.EmployeeMapper;
import com.syncrh.rh_api.dtos.EmployeeRequest;
import com.syncrh.rh_api.dtos.EmployeeResponse;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @PostMapping
    public ResponseEntity<EmployeeResponse> create(@Valid @RequestBody EmployeeRequest request) {
        Employee employee = employeeMapper.toEntity(request);
        Employee saved = employeeService.createEmployee(employee);
        return ResponseEntity.ok(employeeMapper.toResponse(saved));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> findAll() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeMapper.toResponseList(employees));
    }
}
