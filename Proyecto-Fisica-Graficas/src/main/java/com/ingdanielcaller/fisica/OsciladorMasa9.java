import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JFrame;

public class OsciladorMasa9 {

    // Método para calcular posición
    public static double posicion(double A, double omega, double t) {
        return A * Math.cos(omega * t);
    }

    public static void main(String[] args) {

        // Valores del ejercicio
        double k = 100;        // Constante K (puedes cambiar)
        double m = 0.5;        // Masa original (puedes cambiar)
        double A = 0.10;       // Amplitud en metros

        // Masa nueva = 9m
        double m9 = 9 * m;

        // Frecuencia angular ω = sqrt(k/m9)
        double omega = Math.sqrt(k / m9);

        // Serie de puntos (gráfica)
        XYSeries serie = new XYSeries("Oscilación masa 9m");

        // Crear 1000 puntos en 0–10 s
        int N = 1000;
        double tFinal = 10;
        double dt = tFinal / N;

        for (int i = 0; i <= N; i++) {
            double t = i * dt;
            double x = posicion(A, omega, t);
            serie.add(t, x);
        }

        // Colección de datos
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie);

        // Crear gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Movimiento Oscilatorio (masa = 9m)",
                "Tiempo (s)",
                "Posición x(t) (m)",
                dataset
        );

        // Ventana
        JFrame ventana = new JFrame("Gráfica Oscilador Masa 9m");
        ventana.setContentPane(new ChartPanel(chart));
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}