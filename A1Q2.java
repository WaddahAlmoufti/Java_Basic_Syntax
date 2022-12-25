import java.util.Scanner;

public class A1Q2 {

    public static void MultiplicationTable() {
        System.out.println("Please enter a positive integer:");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        // we set up the scanner for input

        int y = x * x;
        String y2 = Integer.toString(y);
        int space = ((y2.length()) + 1);

        // calculating max amount of spaces; max spaces will be input squared length + 1
        // additional space

        String topline = (" *" + " |");
        int count = 4;
        System.out.print(topline);
        for (int i = 1; i <= x; i++) {
            count += space;
            System.out.printf("%" + space + "d", i);
        }
        // Set up first line

        String dash = "-";
        System.out.println();
        for (int i = 1; i <= count; i++) {
            System.out.printf("%s", dash);
        }
        // Set up second line with dashes

        System.out.println();

        for (int i = 1; i <= x; i++) {
            System.out.print(String.format("%2s" + "%2s", i, "|"));
            // set up the left hand side column

            for (int j = 1; j <= x; j++) {
                int product = i * j;
                System.out.printf("%" + space + "d", product);
                // multiplication table generation
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MultiplicationTable();
    }
}
