import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzz {
	
	public static void solution() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] words = line.split(" ");
			int X = Integer.parseInt(words[0]);
			int Y = Integer.parseInt(words[1]);
			int N = Integer.parseInt(words[2]);
			for (int i = 1; i <= N; i++) {
				if (i % X == 0 && i % Y == 0) {
					System.out.println("FizzBuzz");
				}
				else if (i % X == 0) {
					System.out.println("Fizz");
				}
				else if (i % Y == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		solution();

	}

}
