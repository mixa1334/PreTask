package edu.epam.pretask.parser;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.exception.NumberException;

import java.util.List;

public interface CustomNumberParser {
    List<CustomNumber> parseToCustomNumbers(List<String> numbers) throws NumberException;
}
