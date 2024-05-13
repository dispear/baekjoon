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
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] dp = new int[k+1][n+1];
			Bag[] b = new Bag[n+1];
			
			for(int i=0;i<=k;i++) {
				for(int j=0;j<=n;j++) {
					dp[i][j] = 0;
				}
			}
			for(int i=1;i<=n;i++) {
				int v = sc.nextInt();
				int c = sc.nextInt();
				b[i] = new Bag(v,c);
			}
			
			for(int i=1;i<=k;i++) {
				for(int j=1;j<=n;j++) {
					if(b[j].v <= i)
						dp[i][j] = Math.max(dp[i][j-1], dp[i-b[j].v][j-1] + b[j].c);
					else
						dp[i][j] = dp[i][j-1];
				}
			}
			
			System.out.println("#"+test_case+" "+dp[k][n]);
		}
	}
	static class Bag {
		int v;
		int c;
		Bag(int v,int c){
			this.v = v;
			this.c = c;
		}
	}
}
