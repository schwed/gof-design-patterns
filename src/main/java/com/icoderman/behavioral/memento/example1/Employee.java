package com.icoderman.behavioral.memento.example1;

// originator
public class Employee {
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "EverydayEmployee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employee) {
        this.name = employee.getName();
        this.phone = employee.getPhone();
    }
}
