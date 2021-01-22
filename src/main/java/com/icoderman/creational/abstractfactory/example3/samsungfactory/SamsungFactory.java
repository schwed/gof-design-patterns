package com.icoderman.creational.abstractfactory.example3.samsungfactory;

import com.icoderman.creational.abstractfactory.example3.Laptop;
import com.icoderman.creational.abstractfactory.example3.Phone;
import com.icoderman.creational.abstractfactory.example3.TechFactory;

public class SamsungFactory implements TechFactory {

    @Override
    public Laptop getLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public Phone getPhone() {
        return new GalaxyS();
    }

}
