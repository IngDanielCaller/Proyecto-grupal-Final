package mmc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ErrorBTest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testErrorB() {
        double eB = ErrorB.calcular(x, y);
        assertTrue(eB > 0);
    }
}