package test.epam.pretask.services.adder;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import edu.epam.pretask.services.adder.Adder;
import edu.epam.pretask.services.adder.impl.AdderImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdderImplTest {

    @Test
    public void testAddNumbers() {
        CustomNumber firstCustomNumber = new CustomNumberImpl();
        CustomNumber secondCustomNumber = new CustomNumberImpl();
        Adder adder = new AdderImpl(new CustomNumberFactoryImpl());
        secondCustomNumber.setValue(34.77);
        firstCustomNumber.setValue(4.9);

        CustomNumber customNumberResult = adder.addNumbers(firstCustomNumber, secondCustomNumber);

        assertEquals(customNumberResult.getValue(), 39.67);
    }
}