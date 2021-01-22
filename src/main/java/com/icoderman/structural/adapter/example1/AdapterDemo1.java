package com.icoderman.structural.adapter.example1;

import java.util.List;

public class AdapterDemo1 {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }

}
