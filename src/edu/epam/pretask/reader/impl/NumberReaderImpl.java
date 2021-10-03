package edu.epam.pretask.reader.impl;

import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.reader.NumberReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class NumberReaderImpl implements NumberReader {
    public static final String REGEX_NUMBER = "[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)";
    public static final Logger logger = LogManager.getLogger();

    @Override
    public List<String> readNumbers(String filePath) throws NumberException {
        Path path = Paths.get(filePath);

        try (Stream<String> lines = Files.lines(path)) {
            final List<String> result = new LinkedList<>();
            final Pattern pattern = Pattern.compile(REGEX_NUMBER);

            lines.forEach(line -> {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    result.add(matcher.group());
                }
            });

            logger.log(Level.DEBUG, result);
            return result;
        } catch (IOException e) {
            logger.log(Level.INFO, e.getMessage());
            throw new NumberException(e.getMessage(), e);
        }
    }
}
