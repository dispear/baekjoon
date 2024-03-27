import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		visited = new boolean[n+1];
		arr = new ArrayList[n+1];
		int result = 0;
		
		for(int i=0;i<=n;i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				result++;
				dfs(i);
			}
		}
		
		System.out.println(result);
	}
	static void dfs(int x) {
		for(int i : arr[x]) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
}
