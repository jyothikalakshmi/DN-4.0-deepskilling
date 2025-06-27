import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testAdd() {
        sample s1 = new sample();
        int result = s1.add(2, 3);
        System.out.println("result:"+result);
        assertEquals(5, result);
    }

}
