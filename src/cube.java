import java.util.Scanner;

public class cube {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer; // set answer
		String name;

		int num;
		System.out.println("learn your squares and cubes");
		System.out.println("");
		do {
			System.out.print("Enter an integer: ");

			while (scan.hasNextInt() == false) {
				String input = scan.next();
				System.out.println("you entered: " + input);
				System.out.println("please enter a valid number" + " ");
			}
			num = scan.nextInt();

			while (num < 1) {
				System.out.println("you entered: " + num);
				System.out.println("please enter a postive number");

				while (scan.hasNextInt() == false) {
					String input = scan.next(); //
					System.out.println("you entered: " + input);
					System.out.println("please enter a valid number" + " ");
				}
				num = scan.nextInt();
			}
			System.out.println("");
			System.out.println("Number   Squared   Cubed");
			// System.out.println("");
			System.out.println("======   =======   ======");
			System.out.println("");

			for (int i = 1; i < num + 1; i++) {
				System.out.printf("%-7s  %-8s  %d\n", i, square(i), cube(i));
				// System.out.print("");
				// System.out.println("cube of " + i + ": " + cube(i));
			}
			System.out.println("");
			multTable(num);
			System.out.println("");
			System.out.println("Continue? (y/n)");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));
		System.out.println("");
		System.out.println("Goodbye");
	}

	public static int square(int num) {
		return (num * num);
	}

	public static int cube(int num) {
		return (num * num * num);
	}

	public static void multTable(int size) {
		System.out.println("multiplication table");
		System.out.println("");

		System.out.format("    ");
		for (int i = 1; i <= size; i++) {
			System.out.format("%4d", i); // prints top columns
		}
		System.out.println("");
		System.out.print("-------");

		for (int l = 1; l < size; l++) { // prints border
			System.out.print("-----");
		}
		System.out.println("");
		for (int i = 1; i <= size; i++) {
			// print first row
			System.out.format("%2d |", i); // prints border and rest of row
			for (int j = 1; j <= size; j++) {
				System.out.format("%4d", i * j);

			}
			System.out.println("");
		}
	}
}
