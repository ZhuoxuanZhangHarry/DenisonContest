import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class RationalMoves {
	
	public static void solution() throws FileNotFoundException {
		boolean checker = false;
		Scanner scan = new Scanner(new File("RationalMoves.txt"));
		String firstLine = scan.nextLine();
		int num = Integer.parseInt(firstLine);
		for (int i = 0; i < num; i++) {
			String line = scan.nextLine();
			String[] words = line.split(" ");
			int p = Integer.parseInt(words[0]);
			int q = Integer.parseInt(words[1]);
			int r = Integer.parseInt(words[2]);
			int s = Integer.parseInt(words[3]);
			int moves = Integer.parseInt(words[4]);
			int target = r/s;
			for (int k = 1; k <= moves; k++) {
				if (((p + k) / q == target) || ((p - k) / q == target) || (p / (q + k) == target) ||  (p / (q - k) == target)) { 
					System.out.printf("Case %d: YES\n", i + 1);
					checker = true;
					break;
				} 
			}
			if (checker == false) System.out.printf("Case %d: NO\n", i + 1);
			checker = false;
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		solution();

	}

}
