package edu.epam.pretask.reader;

import edu.epam.pretask.exception.NumberException;

import java.util.List;

public interface NumberReader {
    List<String> readNumbers(String path) throws NumberException;
}
