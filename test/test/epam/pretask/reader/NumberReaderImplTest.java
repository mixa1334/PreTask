package test.epam.pretask.reader;

import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.reader.NumberReader;
import edu.epam.pretask.reader.impl.NumberReaderImpl;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class NumberReaderImplTest {

    @Test
    public void testReadNumbersPositiveOutcome() throws NumberException {
        NumberReader numberReader = new NumberReaderImpl();

        String[] expected = {"45", "7.88", "9", "784.55", "6"};

        List<String> actual = numberReader.readNumbers("data/numbers.txt");

        assertEquals(actual, Arrays.asList(expected));
    }

    @Test(expectedExceptions = NumberException.class)
    public void testReadNumbersNegativeOutcome() throws NumberException {
        NumberReader numberReader = new NumberReaderImpl();
        numberReader.readNumbers("array/78/data/numbers.txt");
    }
}