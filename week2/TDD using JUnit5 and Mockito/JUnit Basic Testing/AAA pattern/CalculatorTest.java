import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator(); 
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAdd() {
        int result = calc.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(10, 5);
        assertEquals(5, result);
    }
}
