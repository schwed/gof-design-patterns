package com.icoderman.structural.adapter.example1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Tomson", "john@tomoson.com");
        employees.add(employeeFromDB);

        // Will not work without adapter
        //EverydayEmployee employeeFromLdap = new EmployeeLdap("5432", "Alex", "Johnson", "alex@johnson.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("5432", "Alex", "Johnson", "alex@johnson.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("999,Tom,Piterson,tom@piterson.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));


        return employees;
    }
}
