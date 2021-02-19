import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class leap_year {
	
	public static void solution(String filename) throws FileNotFoundException {
		int caseCount = 0;
		boolean checker = false;
		Scanner scan = new Scanner(new File(filename));
		while (scan.hasNextLine()) {
			caseCount++;
			String line = scan.nextLine();
			String[] words = line.split(" ");
			int year = Integer.parseInt(words[0]);
			int loops = Integer.parseInt(words[1]);
			if (year == 0 && loops == 0) {
				return;
			} else {
				for (int i = 0; i < loops; i++) {
					String subline = scan.nextLine();
					String[] subwords = subline.split(" ");
					int divisor = Integer.parseInt(subwords[1]);
					if (year % divisor == 0 && checker == false) {
						checker = true;
						if (subwords[0].equals("Y")) {
							System.out.printf("Case %d : YES\n", caseCount);
						} else {
							System.out.printf("Case %d : NO\n", caseCount);
						}						
					}
				}
				checker = false;
			}
			
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		solution("Leapyear.txt");
	}

}
