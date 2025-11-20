package mmc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoefATest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testCoefA() {
        double A = CoefA.calcular(x, y);
        assertEquals(0.6, A, 0.001);
    }
}