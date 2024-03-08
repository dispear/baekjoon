import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[] arr = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

			if (a == 0) {
				union(arr, b, c);
			} else if (a == 1) {
				if (find(arr, b) == find(arr, c)) {
					System.out.println("YES");
				} else
					System.out.println("NO");
			}
		}
	}

	static void union(int[] arr, int n, int m) {
		arr[find(arr, n)] = arr[find(arr, m)];
	}

	static int find(int[] arr, int n) {
		if (n == arr[n])
			return n;
		else {
			int a = find(arr, arr[n]);
			arr[n] = a;
			return a;
		}
	}
}