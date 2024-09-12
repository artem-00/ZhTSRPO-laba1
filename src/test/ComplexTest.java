package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    @Test
    public void testSubtraction() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(3, 4);
        Complex result = a.minus(b);

        assertEquals(2.0, result.getReal(), 0.001, "Real part subtraction failed");
        assertEquals(3.0, result.getImaginary(), 0.001, "Imaginary part subtraction failed");
    }
}