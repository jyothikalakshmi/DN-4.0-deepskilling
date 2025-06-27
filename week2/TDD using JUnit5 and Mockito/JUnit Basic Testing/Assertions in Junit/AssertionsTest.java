import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAdd() {
        sample s1 = new sample();
        assertEquals(5, s1.add(2, 3));
        // assertTrue
        assertTrue(s1.Isgreater(5, 3));
        // assertFalse
        assertFalse(s1.Isgreater(2,4));
        // assertNull
        assertNull(s1.returnNull());
        // assertNotNull
        assertNotNull(s1.returnNotNull());
    }

}
