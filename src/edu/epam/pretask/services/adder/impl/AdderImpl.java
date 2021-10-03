package edu.epam.pretask.services.adder.impl;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.services.adder.Adder;

public class AdderImpl implements Adder {
    private CustomNumberFactory customNumberFactory;

    public AdderImpl(CustomNumberFactory customNumberFactory) {
        this.customNumberFactory = customNumberFactory;
    }

    @Override
    public CustomNumber addNumbers(CustomNumber firstTerm, CustomNumber secondTerm) {
        double result = firstTerm.getValue() + secondTerm.getValue();
        return customNumberFactory.createCustomNumber(result);
    }
}
