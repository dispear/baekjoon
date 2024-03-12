import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int p = sc.nextInt();
		String str = sc.next();
		int result = 0;

		int[] arr = new int[4];
		char[] carr = { 'A', 'C', 'G', 'T' };
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] curr_dna = new int[4];
		String part = str.substring(0, p);
		boolean isCorr = true;

		for (int i = 0; i < 4; i++) {
			curr_dna[i] = p - part.replace(carr[i] + "", "").length();
			if (curr_dna[i] < arr[i]) {
				isCorr = false;
			}
		}
		if (isCorr)
			result++;

		for (int i = 1; i <= s - p; i++) {
			isCorr = true;
			switch (str.charAt(i - 1)) {
			case 'A':
				curr_dna[0]--;
				break;
			case 'C':
				curr_dna[1]--;
				break;
			case 'G':
				curr_dna[2]--;
				break;
			case 'T':
				curr_dna[3]--;
				break;
			}
			switch (str.charAt(i + p - 1)) {
			case 'A':
				curr_dna[0]++;
				break;
			case 'C':
				curr_dna[1]++;
				break;
			case 'G':
				curr_dna[2]++;
				break;
			case 'T':
				curr_dna[3]++;
				break;
			}

			for (int j = 0; j < 4; j++) {
				if (curr_dna[j] < arr[j]) {
					isCorr = false;
				}
			}
			if (isCorr) {
				result++;
			}
		}
		System.out.println(result);
	}
}