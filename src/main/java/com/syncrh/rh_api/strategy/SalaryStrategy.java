package com.syncrh.rh_api.strategy;

public interface SalaryStrategy {
    float calculateEmployeeSalary(float grossSalary);

    class Clt implements SalaryStrategy {
        public float calculateEmployeeSalary(float grossSalary) {
            return grossSalary * 0.75f;
        }
    }

    class Pj implements SalaryStrategy {
        public float calculateEmployeeSalary(float grossSalary) {
            return grossSalary * 0.90f;
        }
    }
}
