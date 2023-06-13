package com.bl.poly;

public class Mainpoly {
    public static void main(String[] args) {
        Account account = new Account(1234,"Savings");


        Employee employee = new Employee(12,"Suchitra","Engineer",account);
        employee.displayDetail();
    }
}
