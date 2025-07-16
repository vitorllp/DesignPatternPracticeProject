package com.syncrh.rh_api.report;

import com.syncrh.rh_api.model.Employee;

import java.util.List;

public class AdvancedReport {
    public String build(List<Employee> employees) {
        StringBuilder sb = new StringBuilder("== External Advanced Report ==\n");
        for (Employee e : employees) {
            sb.append("[EMPLOYEE] ")
                    .append(e.getName()).append(" | ")
                    .append(e.getPosition()).append(" | $")
                    .append(e.getSalary()).append("\n");
        }
        return sb.toString();
    }
}

