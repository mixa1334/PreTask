package test.epam.pretask.customnumberfactory;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.factory.CustomNumberFactory;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomNumberFactoryImplTest {

    @Test
    public void testCreateCustomNumber() {
        double value = 34.5674;
        CustomNumberFactory customNumberFactory = new CustomNumberFactoryImpl();
        CustomNumber customNumber = customNumberFactory.createCustomNumber(value);
        double actual = customNumber.getValue();
        customNumber = new CustomNumberImpl();
        customNumber.setValue(value);
        double expected = customNumber.getValue();

        assertEquals(actual, expected);
    }
}