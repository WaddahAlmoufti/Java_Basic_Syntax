import java.util.Arrays;
import java.util.Scanner;

public class A1Q1 {

    /*****************************************************
     * S22
     * Student Name: Mohd Waddah Almoufti
     * 
     * 
     * Student ID:
     ********************************************************/

    public static double[] movingAverage(double[] data, int width) {

        double[] res = new double[data.length];

        for (int i = 0; i < width - 1; i++) {
            res[i] = 0;
            // not sure why they used width-1 not just width; this code establishes the NaN
        }

        for (int i = width - 1; i < data.length; i++) {
            res[i] = Double.NaN;

            for (int j = 0; j < width; j++) {
                res[i] += data[i - j];

            }
            res[i] = res[i] / width;
        }
        System.out.println(res);
        // not sure how to test the code
    }

    public static void main(String[] args) {

        A1Q1.movingAverage(new double[] { 1, 2, 4 }, 1);
    }
}
