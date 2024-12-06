import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.kkk.calculator.calculator;

public class CalculatorTest {

    private calculator ct;
    
    @BeforeEach
    void setUp() {
        ct = new calculator(); 
    }

    @AfterEach
    void tearDown() {
        ct = null; 
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1, 1",
        "1, 2, 3",
        "-2, 2, 0",
        "0, 0, 0",
        "-1, -2, -3"
    })
    
    public void testAddition(int opG,int opD,int expectedResult) {
        int result = calculator.add(opG, opD);
        assertEquals(expectedResult, result, "Addition incorrecte pour les opérandes : " + opG + ", " + opD);
    }


    @Test
    public void testDivision() {
        float result = ct.divide(2, 3);
        assertEquals(2.0f / 3.0f, result, 0.0001, "2 / 3 doit être égal à 2/3");
         result = ct.divide(2, 0);
        assertEquals(Float.NaN, result, "2 / 0 doit être égal à NaN");

    }


    @Test
    void testEnsembleChiffres() {
        Set<Integer> expected = new HashSet<>();
        
        expected.add(6);
        expected.add(7);
        expected.add(9);
        assertEquals(expected, calculator.ensembleChiffres(7679), "Chiffres incorrects pour 7679");

        expected.clear();
        expected.add(1);
        assertEquals(expected, calculator.ensembleChiffres(-11), "Chiffres incorrects pour -11");

        expected.clear();
        expected.add(0);
        assertEquals(expected, calculator.ensembleChiffres(0), "Chiffres incorrects pour 0");

        expected.clear();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, calculator.ensembleChiffres(12345), "Chiffres incorrects pour 12345");
      }
}

