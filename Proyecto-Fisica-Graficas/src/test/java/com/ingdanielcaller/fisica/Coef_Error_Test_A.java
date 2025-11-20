package mmc;

import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorATest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testErrorA() {
        double eA = ErrorA.calcular(x, y);
        assertTrue(eA > 0);
    }
}