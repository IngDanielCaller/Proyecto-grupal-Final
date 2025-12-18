package mmc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ErrorATest {

    double[] x = {1,2,3,4,5};
    double[] y = {2,4,5,4,5};

    @Test
    public void testErrorA() {
        double eA = ErrorA.calcular(x, y);
        assertTrue(eA > 0);
    }
}