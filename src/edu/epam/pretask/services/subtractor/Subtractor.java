package edu.epam.pretask.services.subtractor;

import edu.epam.pretask.entity.CustomNumber;

public interface Subtractor {
    CustomNumber subtractNumbers(CustomNumber minuend, CustomNumber subtrahend);
}
