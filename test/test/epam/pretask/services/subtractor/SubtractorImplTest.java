package test.epam.pretask.services.subtractor;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import edu.epam.pretask.services.subtractor.Subtractor;
import edu.epam.pretask.services.subtractor.impl.SubtractorImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SubtractorImplTest {

    @Test
    public void testSubtractNumbers() {
        CustomNumber minuend = new CustomNumberImpl();
        minuend.setValue(-9);
        CustomNumber subtrahend = new CustomNumberImpl();
        subtrahend.setValue(-89);

        Subtractor subtractor = new SubtractorImpl(new CustomNumberFactoryImpl());
        CustomNumber actual = subtractor.subtractNumbers(minuend, subtrahend);

        assertEquals(actual.getValue(), 80);

    }
}