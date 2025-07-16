package com.syncrh.rh_api.report;

import com.syncrh.rh_api.model.Employee;

import java.util.List;

public class ReportAdapter implements ReportGenerator {

    private final AdvancedReport advancedReport;

    public ReportAdapter(AdvancedReport externalAdvancedReport) {
        this.advancedReport = externalAdvancedReport;
    }

    @Override
    public String generateReport(List<Employee> employees) {
        return advancedReport.build(employees);
    }
}
