import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s1 = sc.next();
			String s2 = sc.next();
			int n = s1.length();
			int m = s2.length();
			
			int[][] dp = new int[n+1][m+1];
			dp[0][0] = 0;
			for(int i = 1;i<=n;i++) {
				dp[i][0] = 0;
			}
			for(int j = 1;j<=m;j++) {
				dp[0][j] = 0;
			}
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++) {
					if(s1.charAt(i-1) == s2.charAt(j-1))
						dp[i][j] = dp[i-1][j-1] + 1;
					else
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
			
			System.out.println("#"+test_case+" "+dp[n][m]);	
		}
	}
}
