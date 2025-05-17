package com.syncrh.rh_api.service;

import com.syncrh.rh_api.exceptions.DuplicateCpfException;
import com.syncrh.rh_api.model.Employee;
import com.syncrh.rh_api.model.NullEmployee;
import com.syncrh.rh_api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        if (employeeRepository.existsByCpf(employee.getCpf())) {
            throw new DuplicateCpfException("CPF already exists.");
        }
        return employeeRepository.save(employee);
    }

    public Employee findByCpf(String cpf) {
        return employeeRepository.findById(cpf).orElse(new NullEmployee());
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}