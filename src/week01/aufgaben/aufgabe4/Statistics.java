package week01.aufgaben.aufgabe4;

import java.util.Arrays;
import java.util.Random;
import java.util.function.DoubleBinaryOperator;

public class Statistics {
    public static void main(String[] args) {
        double[] series = randomSeries(10000);
        // implement statistical analysis
        Arrays.sort(series);
        System.out.println("Minimum / maximum: " + series[0] + " / " + series[series.length - 1]);
        System.out.println("Arithmetic average: " + arithmeticAverage(series));
        System.out.println("Variance: " + variance(series));
        System.out.println("Standard deviation: " + standartDeviation(series));
    }

    static double[] randomSeries(int amount) {
        double[] series = new double[amount];
        Random random = new Random(4711);
        for (int index = 0; index < amount; index++) {
            series[index] = random.nextDouble();
        }
        return series;
    }

    static double arithmeticAverage(double[] pSeries) {
        double sum = Arrays.stream(pSeries).reduce(0, (subTotal, item) -> subTotal + item);
        return sum / pSeries.length;
    }

    static double variance(double[] pSeries) {
        double avg = arithmeticAverage(pSeries);
        double v = 0;
        for (double d : pSeries)
            v += Math.pow(d - avg, 2);
        return v / pSeries.length;
    }

    static double standartDeviation(double[] pSeries) {
        return Math.sqrt(variance(pSeries));
    }
}