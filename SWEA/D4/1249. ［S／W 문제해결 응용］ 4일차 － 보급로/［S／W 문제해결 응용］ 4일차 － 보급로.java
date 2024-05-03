import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{
	static int[][] visited;
	static int[][] arr;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			
			arr = new int[n][n];
			visited = new int[n][n];
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				for(int j=0;j<n;j++) {
					arr[i][j] = s.charAt(j) - '0';
					visited[i][j] = Integer.MAX_VALUE;
				}
			}
			
			visited[0][0] = arr[0][0];

			System.out.println("#"+test_case+" "+bfs(n));	
		}
	}
	static int bfs(int n) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{0,0});
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			for(int i=0;i<4;i++) {
				int hy = node[0] + dy[i];
				int hx = node[1] + dx[i];
				
				if(hy < 0 || hx <0 || hy >= n || hx >= n)
					continue;
				
				if(visited[hy][hx] > visited[node[0]][node[1]] + arr[hy][hx]) {
					visited[hy][hx] = visited[node[0]][node[1]] + arr[hy][hx];
					q.add(new int[] {hy,hx});
				}
			}
		}
		return visited[n-1][n-1];
	}
}
