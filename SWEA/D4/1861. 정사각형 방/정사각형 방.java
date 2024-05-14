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
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[] dp = new int[n*n+1];
			Xy[] xy = new Xy[n*n+1];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int num = sc.nextInt();
					arr[i][j] = num;
					xy[num] = new Xy(i,j);
					dp[num] = 1;
				}
			}
			
			for(int i=n*n-1;i>0;i--) {
				for(int j=0;j<4;j++) {
					if(xy[i].y + dy[j] < 0 || xy[i].y + dy[j] >= n || xy[i].x + dx[j] < 0 || xy[i].x + dx[j] >= n)
						continue;
					if(arr[xy[i].y+dy[j]][xy[i].x+dx[j]]== i+1) {
						dp[i] = dp[i+1] + 1;
						break;
					}
				}
			}
			
			int max = 0;
			int a = 0;
			for(int i=1;i<=n*n;i++) {
				if(dp[i] > max) {
					max = dp[i];
					a = i;
				}
			}
			System.out.println("#"+test_case+" "+a+" "+max);
		}
	}
	static class Xy{
		int y;
		int x;
		
		Xy(int y,int x){
			this.x =x;
			this.y =y;
		}
	}
}
