import java.util.Scanner;

public class Exact_Change {

	public static void solution() {
		Scanner scan = new Scanner(System.in);
		int amountOfTest = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < amountOfTest; i++) {
			/// single test
			int target = Integer.parseInt(scan.nextLine());
			int numOfbills = Integer.parseInt(scan.nextLine());
			int baseCase = Integer.parseInt(scan.nextLine());
			int[] arr = new int[numOfbills];
			arr[0] = baseCase;
			for (int q = 1; q < target; q++) {
				int bill = Integer.parseInt(scan.nextLine());
				if (arr[q - 1] + bill > arr[q - 1])
			}
		}
		scan.close();
	}

	public static void main(String[] args) {
		solution();
	}

}
