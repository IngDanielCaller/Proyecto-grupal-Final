package mmc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoefATest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testCoefA() {
        double A = CoefA.calcular(x, y);
        assertEquals(0.6, A, 0.001);
    }
}