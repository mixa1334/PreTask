package edu.epam.pretask.validator.impl;

import edu.epam.pretask.validator.NumberValidator;

public class NumberValidatorImp implements NumberValidator {
    public static final String REGEX_FILTER = "^[+-]?([0-9]{0,5}\\.)?[0-9]{1,5}$";

    @Override
    public boolean validate(String number) {
        return number.matches(REGEX_FILTER);
    }
}
