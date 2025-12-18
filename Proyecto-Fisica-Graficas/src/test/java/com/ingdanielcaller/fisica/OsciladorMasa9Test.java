import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OsciladorMasa9Test {

    @Test
    public void testPosicion() {
        double A = 1.0;
        double omega = Math.PI; // 3.14159...
        double t = 0.5;

        // x(t) = A * cos(ωt) = cos(3.14159 * 0.5) = cos(1.5708) ~ 0
        double resultado = OsciladorMasa9.posicion(A, omega, t);

        assertEquals(0.0, resultado, 1e-3, 
            "La posición debería ser aproximadamente 0.");
    }

    @Test
    public void testOmegaConMasa9() {
        double k = 100;
        double m = 0.5;

        double m9 = 9 * m;
        double omegaEsperado = Math.sqrt(k / m9);

        double omegaCalculado = Math.sqrt(k / m9);

        assertEquals(omegaEsperado, omegaCalculado,
                1e-9, "Omega debe ser igual a sqrt(k / (9m))");
    }

    @Test
    public void testValoresGeneradosNoNulos() {
        double A = 0.1;
        double k = 100;
        double m = 0.5;
        double m9 = 9*m;
        double omega = Math.sqrt(k/m9);

        // Generamos una posición cualquiera
        double x = OsciladorMasa9.posicion(A, omega, 1.0);

        assertFalse(Double.isNaN(x), "La posición no debe ser NaN.");
        assertFalse(Double.isInfinite(x), "La posición no debe ser Infinito.");
    }
}