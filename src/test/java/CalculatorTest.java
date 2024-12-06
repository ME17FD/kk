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
    @Test
    public void testDivision() {
        calculator ct = new calculator();
        float result = ct.divide(2, 3);
        assertEquals(2.0f / 3.0f, result, 0.0001, "2 / 3 doit être égal à 2/3");
         result = ct.divide(2, 0);
        assertEquals(Float.NaN, result, "2 / 0 doit être égal à NaN");

    }
}
