import java.util.Arrays;
import java.util.Scanner;

public class A1Q1 {

    /*****************************************************
     * S22
     * Student Name: Mohd Waddah Almoufti
     * 
     * 
     * Student ID: 101001582
     ********************************************************/

    public static double[] movingAverage(double[] data, int width) {

        double[] res;
        res = new double[data.length];

        for (int i = 0; i < data.length; i++) {

            int position;
            position = i + 1 - width;

            double total;
            total = 0;

            if (position < 0) {
                res[i] = Double.NaN;
            }

            // above code should add NaN. need to check if Double.NaN is correct

            else {

                for (int j = 0; j < width; j++) {
                    total += data[i - j];
                    res[i] = total / width;
                }

            }

            // this code should produce the moving average need to check with TA

        }
        return res;

    }

    public static void main(String[] args) {

        double[] d = { 1, 2, 4, 10, 22, 23 };

        System.out.println(Arrays.toString(movingAverage(d, 3)));

    }
}
