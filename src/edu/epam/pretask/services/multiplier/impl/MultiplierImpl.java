package edu.epam.pretask.services.multiplier.impl;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.services.multiplier.Multiplier;

public class MultiplierImpl implements Multiplier {
    private CustomNumberFactory customNumberFactory;

    public MultiplierImpl(CustomNumberFactory customNumberFactory) {
        this.customNumberFactory = customNumberFactory;
    }

    @Override
    public CustomNumber multiplyNumbers(CustomNumber firstFactor, CustomNumber secondFactor) {
        double result = firstFactor.getValue() * secondFactor.getValue();
        return customNumberFactory.createCustomNumber(result);
    }
}
