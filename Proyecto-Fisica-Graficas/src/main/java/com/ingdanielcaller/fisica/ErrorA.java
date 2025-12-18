package mmc;

public class ErrorA {

    public static double calcular(double[] x, double[] y) {

        double A = CoefA.calcular(x, y);
        double B = CoefB.calcular(x, y);

        int n = x.length;
        double sumRes = 0;
        double sumX = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double yPred = A * x[i] + B;
            sumRes += Math.pow(y[i] - yPred, 2);
            sumX += x[i];
            sumX2 += x[i] * x[i];
        }

        return Math.sqrt(
                (n * sumRes) /
                ((n - 2) * (n * sumX2 - sumX * sumX))
        );
    }
}