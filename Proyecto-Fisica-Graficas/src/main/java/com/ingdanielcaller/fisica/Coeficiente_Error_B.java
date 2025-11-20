package mmc;

public class ErrorB {

    public static double calcular(double[] x, double[] y) {

        double errorA = ErrorA.calcular(x, y);

        int n = x.length;
        double sumX = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumX2 += x[i] * x[i];
        }

        return errorA *
                Math.sqrt(sumX2 /
                (n * (n * sumX2 - sumX * sumX)));
    }
}