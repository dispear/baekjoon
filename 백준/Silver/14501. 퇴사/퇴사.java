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
		int[][] arr = new int[n+1][2];
		int[] d = new int[n+2];
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=n;i>=1;i--) {
			// 상담을 햇을 때 끝난다 d[i] = MAX(d[i+1], d[i+t[i]] + p[i])
			if(i + arr[i][0] <= n +1) {
				d[i] = Math.max(d[i+1], d[i+arr[i][0]] + arr[i][1]);
			}else { // 상담을 했을 때 안끝날것 같다면 d[i] = d[i+1]
				d[i] = d[i+1];
			}
		}

		sb.append(d[1]);
		System.out.println(sb);
	}
}