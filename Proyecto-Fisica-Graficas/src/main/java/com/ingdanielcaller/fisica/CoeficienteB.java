package mmc;

public class CoefB {

    public static double calcular(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
        }

        double A = CoefA.calcular(x, y);

        return (sumY - A * sumX) / n;
    }
}