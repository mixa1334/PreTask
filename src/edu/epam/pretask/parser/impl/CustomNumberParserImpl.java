package edu.epam.pretask.parser.impl;

import edu.epam.pretask.parser.CustomNumberParser;
import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.validator.NumberValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class CustomNumberParserImpl implements CustomNumberParser {
    public static final Logger logger = LogManager.getLogger();
    private CustomNumberFactory customNumberFactory;
    private NumberValidator numberValidator;

    public CustomNumberParserImpl(CustomNumberFactory customNumberFactory, NumberValidator numberValidator) {
        this.customNumberFactory = customNumberFactory;
        this.numberValidator = numberValidator;
    }

    @Override
    public List<CustomNumber> parseToCustomNumbers(List<String> numbers) throws NumberException {
        List<CustomNumber> result = new LinkedList<>();
        for (String str : numbers) {
            if (!numberValidator.validate(str)) {
                String message = "incorrect input: " + str;
                logger.log(Level.INFO, message);
                throw new NumberException(message);
            }
            CustomNumber parsed = customNumberFactory.createCustomNumber(Double.parseDouble(str));
            result.add(parsed);
        }

        logger.log(Level.DEBUG, "after parsing: " + result);
        return result;
    }
}
