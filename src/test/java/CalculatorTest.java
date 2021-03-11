import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double DELTA = 0.00000005;

    @Test
    public void squ_positive(){
        assertEquals("Positive Test Case: squareRoot, ", 6, Calculator.squareRoot(36), DELTA);

        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Calculator.squareRoot(-9), DELTA);

        assertEquals("Positive Test Case: squareRoot, ", 0, Calculator.squareRoot(0), DELTA);
    }

    @Test
    public void squ_negative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 3, Calculator.squareRoot(64), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 7, Calculator.squareRoot(0), DELTA);


        assertNotEquals("Negative Test Case: squareRoot, ", 98, Calculator.squareRoot(-9), DELTA);
    }



    @Test
    public void fact_positive() {

        assertEquals("Positive Test Case: Factorial, ", 40320, Calculator.factorial(8), DELTA);

        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Calculator.factorial(-10), DELTA);

        assertEquals("Positive Test Case: Factorial, ", 120, Calculator.factorial(5), DELTA);

    }

    @Test
    public void fact_negative() {
        assertNotEquals("Negative Test Case: Factorial,", 25, Calculator.factorial(8), DELTA);

        assertNotEquals("Negative Test Case: Factorial,", 26, Calculator.factorial(3), DELTA);

        assertNotEquals("Negative Test Case: Factorial,", 232, Calculator.factorial(-25), DELTA);
    }



    @Test
    public void pow_positive() {

        assertEquals("Positive Test Case: Power, ", 8, Calculator.cal_pow(2, 3), DELTA);

        assertEquals("Positive Test Case: Power,", 0.015625, Calculator.cal_pow(8, -2), DELTA);

        assertEquals("Positive Test Case: Power, ", Double.NaN, Calculator.cal_pow(0, 0), DELTA);

    }


    @Test
    public void pow_negative() {

        assertNotEquals("Negative Test Case: Power, ", 32, Calculator.cal_pow(2, 3), DELTA);

        assertNotEquals("Negative Test Case: Power, ", 326, Calculator.cal_pow(7, 6), DELTA);

        assertNotEquals("Negative Test Case: Power, ", 6, Calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {

        assertEquals("Positive Test Case: Log, ", 2.302585092994, Calculator.cal_natural_log(10), DELTA);

        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Calculator.cal_natural_log(0), DELTA);

        assertEquals("Positive Test Case: Log, ", Double.NaN, Calculator.cal_natural_log(-7), DELTA);
    }

    @Test
    public void logNegative(){

        assertNotEquals("Negative Test Case: Log, ", 3.567, Calculator.cal_natural_log(4), DELTA);

        assertNotEquals("Negative Test Case: Log, ", 66, Calculator.cal_natural_log(-5), DELTA);

        assertNotEquals("Negative Test Case: Log, ", 75, Calculator.cal_natural_log(45), DELTA);


    }

}