package week02.Aufgabe3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Random;

public class RecursiveSum {

    public static void main(String[] args) {
        int[] series = randomSeries(1000);
        // Compute the sum of the series recursively
        System.out.println(recursiveSum(series, 0));
    }

    static int[] randomSeries(int amount) {
        Random random = new Random(4711);
        int[] series = new int[amount];
        for (int index = 0; index < amount; index++) {
            series[index] = random.nextInt(10);
        }
        return series;
    }

    public static int recursiveSum(int[] intArray, int startingIndex) {
        if (startingIndex == intArray.length - 2)
            return intArray[intArray.length - 1] + intArray[intArray.length - 2];
        else
            return intArray[startingIndex] + intArray[++startingIndex] + recursiveSum(intArray, ++startingIndex);
    }

}
