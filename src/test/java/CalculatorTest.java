import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.kkk.calculator.calculator;

public class CalculatorTest {

    @Test
    public void testAddition() {
        calculator ct = new calculator();
        int result = ct.add(2, 3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");
    }
}
