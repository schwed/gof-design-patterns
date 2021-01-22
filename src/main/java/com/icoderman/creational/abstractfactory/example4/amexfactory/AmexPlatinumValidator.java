package com.icoderman.creational.abstractfactory.example4.amexfactory;

import com.icoderman.creational.abstractfactory.example4.CreditCard;
import com.icoderman.creational.abstractfactory.example4.Validator;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
