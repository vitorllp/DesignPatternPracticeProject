package com.syncrh.rh_api.report;

import com.syncrh.rh_api.model.Employee;

import java.util.List;

//Old generator
public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String generateReport(List<Employee> employees) {
        StringBuilder sb = new StringBuilder("Report:\n");
        for (Employee e : employees) {
            sb.append(e.getName()).append(" - ").append(e.getPosition()).append("\n");
        }
        return sb.toString();
    }
}
