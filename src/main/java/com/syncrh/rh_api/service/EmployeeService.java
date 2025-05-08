package com.syncrh.rh_api.service;

import com.syncrh.rh_api.dtos.EmployeeMapper;
import com.syncrh.rh_api.exceptions.DuplicateCpfException;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public Employee createEmployee(Employee employee) {
        if (employeeRepository.existsByCpf(employee.getCpf())) {
            throw new DuplicateCpfException("CPF already exists.");
        }
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}