package edu.epam.pretask.services.divider;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.exception.NumberException;

public interface Divider {
    public CustomNumber divideNumbers(CustomNumber dividend, CustomNumber divisor) throws NumberException;
}
