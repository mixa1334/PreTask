package test.epam.pretask.parser;

import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.parser.CustomNumberParser;
import edu.epam.pretask.parser.impl.CustomNumberParserImpl;
import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import edu.epam.pretask.validator.NumberValidator;
import edu.epam.pretask.validator.impl.NumberValidatorImp;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ParserImplTest {

    @Test
    public void testParsePositiveOutcome() throws NumberException {
        List<String> input = Arrays.asList("45", "-89.102", "102.5", ".25", "23.99", "0");
        double[] expectedNumbers = {45, -89.102, 102.5, .25, 23.99, 0};
        CustomNumberFactory customNumberFactory = new CustomNumberFactoryImpl();
        NumberValidator numberValidator = new NumberValidatorImp();

        CustomNumberParser parser = new CustomNumberParserImpl(customNumberFactory, numberValidator);
        List<CustomNumber> actual = parser.parseToCustomNumbers(input);

        List<CustomNumber> expected = new ArrayList<>(6);
        for (double number : expectedNumbers) {
            CustomNumber customNumber = customNumberFactory.createCustomNumber(number);
            expected.add(customNumber);
        }

        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NumberException.class)
    public void testParseNegativeOutcome() throws NumberException {
        List<String> input = Arrays.asList("(45", "-89.10fg2", "10    2.5", ".25", "23.99", "0");

        CustomNumberFactory customNumberFactory = new CustomNumberFactoryImpl();
        NumberValidator numberValidator = new NumberValidatorImp();

        CustomNumberParser parser = new CustomNumberParserImpl(customNumberFactory, numberValidator);
        parser.parseToCustomNumbers(input);
    }
}