import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HitTarget {

	public static void solution(String filename) throws FileNotFoundException {
		int caseCount = 0;
		Scanner scan = new Scanner(new File (filename));
		while (scan.hasNextLine()) {
			caseCount += 1;
			String line = scan.nextLine();
			String[] words = line.split(" ");
			if (words[0].equals("0") && words[1].equals("0")) {
				return;
			} else {
				int[] arr = new int[words.length];
				for (int i = 0; i < words.length; i++) {
					arr[i] = Integer.parseInt(words[i]);
				}
				Arrays.sort(arr);
				int realSum = 0;
				int targetSum = arr[0];
				System.out.println(arr[1]);
				int num = arr[1];
				int indexPositive = 0;
				float everageSum = 0;
				float expectEverage = (float) (targetSum * 1.0 / num);
				for (int q = 2; q < arr.length; q++) {
					realSum += arr[q];
					everageSum += arr[q] - expectEverage;
					if (arr[q] - expectEverage >= 0) {
						indexPositive = q;
					}
				}
				if (realSum < targetSum) {
					System.out.printf("Case%d:NONE\n", caseCount);
				} else if (realSum == targetSum) {
					System.out.printf("Case%d:%d/1\n", caseCount, arr[arr.length - 1]);
				} else {
					int sumPositive = 0;
					for (int z = indexPositive; z < arr.length; z++) {
						sumPositive += arr[z];
					}
					int dominator = arr.length - indexPositive;
					float numerator = sumPositive - everageSum;
					System.out.printf("Case%d:%f/%d\n", caseCount, numerator, dominator);
				}
				
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		solution("Target.txt");

	}

}
