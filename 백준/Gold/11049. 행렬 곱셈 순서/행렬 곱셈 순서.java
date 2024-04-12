import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int[][] arr;
	static int[][] d;
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n+1][2];
		d = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				d[i][j] = -1;
		}
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		sb.append(ex(1,n));
		System.out.println(sb);
	}
	static int ex(int s,int e) {
		int minValue = Integer.MAX_VALUE;
		if(d[s][e] != -1)
			return d[s][e];
		if(s == e)
			return 0;
		if(s+1 == e)
			return arr[s][0] * arr[s][1] * arr[e][1];
		
		for(int i=s;i<e;i++) {
			int a = arr[s][0] * arr[i][1] * arr[e][1];
			minValue = Math.min(minValue, ex(s,i) + ex(i+1,e) + a);
		}
		
		return d[s][e] = minValue;
	}
}