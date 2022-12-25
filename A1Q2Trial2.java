import java.util.Scanner;

public class A1Q2 {

	public static void MultiplicationTable() {
		System.out.println("Please enter a positive integer:");
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();

		// we set up the scanner for input

		System.out.print("\t" + "*" + "|" + "\t");
		for (int i = 1; i <= x; i++) {
			System.out.print(i + "\t");
		}

		// set up the first line of multiplication table

		System.out.print("\n" + "-----------------");
		for (int i = 1; i <= x; i++) {
			System.out.print("--------");
		}

		// set up the dashes could be wrong (not sure yet)

		for (int i = 1; i <= x; i++) {
			System.out.print("\n" + "\t" + i + "|");
			for (int j = 1; j <= x; j++) {
				System.out.print("\t" + i * j);
			}

		}

		// set up left hand side of the table and multiplication table;

		// need to ask about the spacing for number 10

	}

	public static void main(String[] args) {
		MultiplicationTable();
	}
}
