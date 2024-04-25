import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int result1, result2;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 
		dp[0] = arr[0];
		for(int i = 1;i<n;i++) {
			dp[i] = Math.max(dp[i-1] + arr[i] , arr[i]);
		}
		
		int result = Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			result = Math.max(result, dp[i]);
		}

		System.out.println(result);
	}
}