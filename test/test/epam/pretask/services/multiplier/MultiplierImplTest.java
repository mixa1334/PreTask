package test.epam.pretask.services.multiplier;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import edu.epam.pretask.services.multiplier.Multiplier;
import edu.epam.pretask.services.multiplier.impl.MultiplierImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplierImplTest {

    @Test
    public void testMultiplyNumbers() {
        CustomNumber firstFactor = new CustomNumberImpl();
        firstFactor.setValue(-2.5);
        CustomNumber secondFactor = new CustomNumberImpl();
        secondFactor.setValue(77.25);
        Multiplier multiplier = new MultiplierImpl(new CustomNumberFactoryImpl());

        CustomNumber actual = multiplier.multiplyNumbers(firstFactor, secondFactor);
        double expected = -193.125;

        assertEquals(actual.getValue(), expected);
    }
}