package edu.epam.pretask.services.subtractor.impl;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.services.subtractor.Subtractor;

public class SubtractorImpl implements Subtractor {
    private CustomNumberFactory customNumberFactory;

    public SubtractorImpl(CustomNumberFactory customNumberFactory) {
        this.customNumberFactory = customNumberFactory;
    }

    @Override
    public CustomNumber subtractNumbers(CustomNumber minuend, CustomNumber subtrahend) {
        double result = minuend.getValue() - subtrahend.getValue();
        return customNumberFactory.createCustomNumber(result);
    }
}
