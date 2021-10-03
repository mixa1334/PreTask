package edu.epam.pretask.services.multiplier;

import edu.epam.pretask.entity.CustomNumber;

public interface Multiplier {
    public CustomNumber multiplyNumbers(CustomNumber firstFactor, CustomNumber secondFactor);
}
