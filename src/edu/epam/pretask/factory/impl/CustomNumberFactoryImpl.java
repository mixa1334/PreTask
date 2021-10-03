package edu.epam.pretask.factory.impl;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.factory.CustomNumberFactory;

public class CustomNumberFactoryImpl implements CustomNumberFactory {
    @Override
    public CustomNumber createCustomNumber(double value) {
        CustomNumber customNumber = new CustomNumberImpl();
        customNumber.setValue(value);
        return customNumber;
    }
}
