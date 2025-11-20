package mmc;

import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorBTest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testErrorB() {
        double eB = ErrorB.calcular(x, y);
        assertTrue(eB > 0);
    }
}