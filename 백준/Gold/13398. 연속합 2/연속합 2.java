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
		int[] arr = new int[n];
		int[] leftsum = new int[n];
		int[] rightsum = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int maxValue = arr[0];
		leftsum[0] = arr[0];
		rightsum[n-1] = arr[n-1];
		
		// 안뺏을 때 경우
		for(int i=1;i<n;i++) {
			leftsum[i] = Math.max(arr[i], leftsum[i-1] + arr[i]);
			maxValue = Math.max(leftsum[i], maxValue);
		}
		for(int i=n-2;i>=0;i--) {
			rightsum[i] = Math.max(arr[i], rightsum[i+1] + arr[i]);
		}
		
		// 뺏을 때 경우
		for(int i=1;i<n-1;i++) {
			maxValue = Math.max(maxValue, leftsum[i-1] + rightsum[i+1]);
		}
		// dp[n] = dp[n+1] + dp[n-1];
		
		sb.append(maxValue);
		System.out.println(sb);
	}
}
