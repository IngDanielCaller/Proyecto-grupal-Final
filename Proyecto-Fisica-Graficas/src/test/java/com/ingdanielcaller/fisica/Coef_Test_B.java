package mmc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoefBTest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testCoefB() {
        double B = CoefB.calcular(x, y);
        assertEquals(2.2, B, 0.001);
    }
}