package com.saveetha.employee_app.employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String employeeName;
    private String employeeEmail;
    private LocalDate employeeDOB;
    private Integer employeeAge;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeEmail, LocalDate employeeDOB, Integer employeeAge) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeDOB = employeeDOB;
        this.employeeAge = employeeAge;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public LocalDate getEmployeeDOB() {
        return employeeDOB;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }
}
