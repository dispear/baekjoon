import java.util.*;

public class Main {
	static boolean[] visited;
	static int[] parent;
	static ArrayList<Integer>[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		visited = new boolean[n + 1];
		parent = new int[n + 1];
		arr = new ArrayList[n + 1];

		for (int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[a].add(b);
			arr[b].add(a);
		}
		
		visited[1] = true;
		dfs(1);
		
		for (int i = 2; i <= n; i++) {
			System.out.println(parent[i]);
		}

	}

	static void dfs(int v) {
		for (int i : arr[v]) {
			if (!visited[i]) {
				parent[i] = v;
				visited[i] = true;
				dfs(i);
			}
		}
	}
}