import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static StringBuilder sb;
	static int n;
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		for(int i=1;i<=n;i++) {
			Collections.sort(arr[i]);
		}
		
		dfs(v);
		sb.append("\n");
		visited = new boolean[n+1];
		bfs(v);
		System.out.println(sb);
		
	}
	static void dfs(int x) {
		visited[x] = true;
		sb.append(x + " ");
		for(int i=0;i<arr[x].size();i++) {
			int a = arr[x].get(i);
			if(!visited[a]) {
				dfs(a);
			}
		}
	}
	static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[x] = true;
		sb.append(x + " ");
		q.add(x);
		while(!q.isEmpty()) {
			x = q.poll();
			for(int i=0;i<arr[x].size();i++) {
				int a = arr[x].get(i);
				if(!visited[a]) {
					visited[a] = true;
					sb.append(a + " ");
					q.add(a);
				}
			}
		}
	}
}
