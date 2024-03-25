import java.util.*;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean[] visited; 
	static int[][] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			arr[i] = new ArrayList<>();
		}
		
		// 트리구현
		for(int i=1;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a].add(b);
			arr[b].add(a);
		}
		// dfs 탐색
		parent = new int[2][n+1];
		visited[1] = true;
		parent[1][1] = 1; // 깊이
		dfs(1,1);
		

		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 데이터 깊이 같게 하기
			while(parent[1][a] != parent[1][b]) {
				if(parent[1][a] > parent[1][b] ) {
					a = parent[0][a];
				}else
					b = parent[0][b];
			}

			// 부모로 이동
			while(a != b) {
				a = parent[0][a];
				b = parent[0][b];
			}
			System.out.println(a);
		}
	}
	
	static void dfs(int x,int depth) {
		for(int i : arr[x]) {
			if(!visited[i]) {
				visited[i] = true;
				parent[0][i] = x;
				parent[1][i] = depth+1;
				dfs(i,depth+1);
			}
		}
	}
}