import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] arr = new ArrayList[n+1];
		int[] count = new int[n+1];
		int[] sort = new int[n];
		boolean[] visited = new boolean[n+1];

		for(int i=0;i<=n;i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			count[b]++;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(count[j] == 0 && visited[j] == false) {
					sort[i] = j;
					for(int k=0;k<arr[j].size();k++) {
						count[arr[j].get(k)]--;
					}
					visited[j] = true;
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			sb.append(sort[i] + " ");
		}
		
		System.out.println(sb);
	}
}