package com.bl.Association;

public class MainAssociation {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123,"Ram");
        Employee employee2 = new Employee(456,"Pihu");
        Employee employee3 = new Employee(789,"Sanjay");

        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Department department = new Department(12,"Engineering",employees);
        department.show();

    }
}
