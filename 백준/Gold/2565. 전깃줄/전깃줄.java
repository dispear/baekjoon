import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][2];

		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
		});
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i][1] > arr[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		int cnt = 0;
		for(int i=0;i<n;i++) {
			cnt = Math.max(cnt, dp[i]);
		}

		System.out.println(n-cnt);
	}
}