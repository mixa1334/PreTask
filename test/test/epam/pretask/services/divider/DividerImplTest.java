package test.epam.pretask.services.divider;

import edu.epam.pretask.entity.CustomNumber;
import edu.epam.pretask.entity.impl.CustomNumberImpl;
import edu.epam.pretask.exception.NumberException;
import edu.epam.pretask.factory.impl.CustomNumberFactoryImpl;
import edu.epam.pretask.services.divider.Divider;
import edu.epam.pretask.services.divider.impl.DividerImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DividerImplTest {
    CustomNumber dividendNumber;
    CustomNumber divisorNumber;
    Divider divider;

    @BeforeTest
    public void initData() {
        dividendNumber = new CustomNumberImpl();
        divisorNumber = new CustomNumberImpl();
        divider = new DividerImpl(new CustomNumberFactoryImpl());
    }

    @Test(expectedExceptions = NumberException.class)
    public void testDivideNumbersDividingByZero() throws NumberException {
        dividendNumber.setValue(-89.5);
        divisorNumber.setValue(0);

        divider.divideNumbers(dividendNumber, divisorNumber);
    }

    @Test
    public void testDivideNumbers() throws NumberException {
        dividendNumber.setValue(-89.5);
        divisorNumber.setValue(-10);

        CustomNumber result = divider.divideNumbers(dividendNumber, divisorNumber);

        assertEquals(result.getValue(), 8.95);
    }
}