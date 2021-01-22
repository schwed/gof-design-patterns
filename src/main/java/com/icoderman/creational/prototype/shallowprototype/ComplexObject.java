package com.icoderman.creational.prototype.shallowprototype;

public class ComplexObject implements Cloneable {
    private Integer id;
    private String name;
    private Record record;

    public ComplexObject(Integer id, String name, Record record) {
        this.id = id;
        this.name = name;
        this.record = record;
    }

    @Override
    public ComplexObject clone() {
        try {
            return (ComplexObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Record getRecord() {
        return record;
    }
}
