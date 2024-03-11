import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int num = i;
			while (sum < n) {
				sum += num;
				num++;
			}
			if (sum == n) {
				count++;
			}
			sum = 0;
		}
		System.out.println(count);
	}
}