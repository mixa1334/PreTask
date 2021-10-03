package test.epam.pretask.validator;

import edu.epam.pretask.validator.NumberValidator;
import edu.epam.pretask.validator.impl.NumberValidatorImp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class NumberValidatorImpTest {
    NumberValidator numberValidator;

    @BeforeMethod
    public void setUp() {
        numberValidator = new NumberValidatorImp();
    }

    @Test
    public void testValidatePositiveOutcome() {
        assertTrue(numberValidator.validate("-89.21"));
    }

    @Test
    public void testValidateNegativeOutcome() {
        assertFalse(numberValidator.validate("-89,21"));
    }
}