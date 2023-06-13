package com.bl.Association;

public class Employee {
    private Integer empId;
    private String empName;

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
