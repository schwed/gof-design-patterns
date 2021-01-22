package com.icoderman.creational.abstractfactory.example4.visafactory;

import com.icoderman.creational.abstractfactory.example4.CreditCard;
import com.icoderman.creational.abstractfactory.example4.Validator;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
