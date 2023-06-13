package com.bl.Association;
import java.util.SortedMap;

public class Department {
    private Integer depId;
    private String depName;

    Employee[] employees;

    public Department(Integer depId, String depName, Employee[] employees) {
        this.depId = depId;
        this.depName = depName;
        this.employees = employees;
    }

    public void show(){
        System.out.println("********Department details*********");
        System.out.println("====================================");
        System.out.println("depart Id :: " + depId);
        System.out.println("Depart Name :: " + depName);

        System.out.println("****************************************");
        System.out.println("*********Employee details***************");

        for (Employee emp : employees) {
            System.out.println("Emp Id ::" + emp.getEmpId());
            System.out.println("Emp Name :: " + emp.getEmpName());

        }
    }
}
