package edu.epam.pretask.services.divider.impl;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.services.divider.Divider;

public class DividerImpl implements Divider {
    private CustomNumberFactory customNumberFactory;

    public DividerImpl(CustomNumberFactory customNumberFactory) {
        this.customNumberFactory = customNumberFactory;
    }

    @Override
    public CustomNumber divideNumbers(CustomNumber dividend, CustomNumber divisor) throws NumberException {
        if (divisor.getValue() == 0.0) {
            throw new NumberException();
        }

        double result = dividend.getValue() / divisor.getValue();
        return customNumberFactory.createCustomNumber(result);
    }
}
