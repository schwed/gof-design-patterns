package com.icoderman.structural.adapter.example1;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String getLastName() {
        return instance.getFamilyName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
