import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			char[][] arr = new char[n][n];
			boolean flag = false;
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				for(int j=0;j<n;j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			//가로
			for(int i=0;i<n;i++) {
				if(flag)
					break;
				for(int j=0;j<=n-5;j++) {
					int check = 0;
					while(check < 5) {
						if(arr[i][j+check] == 'o') {
							check++;
						}else
							break;
					}
					if(check == 5) 
						flag = true;
				}
			}
			
			//세로
			for(int i=0;i<n;i++) {
				if(flag)
					break;
				for(int j=0;j<=n-5;j++) {
					int check = 0;
					while(check < 5) {
						if(arr[j+check][i] == 'o') {
							check++;
						}else
							break;
					}
					if(check == 5) 
						flag = true;
				}
			}
			
			//대각1
			for(int i=0;i<=n-5;i++) {
				if(flag)
					break;
				for(int j=0;j<=n-5;j++) {
					int check = 0;
					while(check < 5) {
						if(arr[i+check][j+check] == 'o') {
							check++;
						}else
							break;
					}
					if(check == 5) 
						flag = true;
				}
			}
			// 대각2
			for(int i=0;i<=n-5;i++) {
				if(flag)
					break;
				for(int j=n-1;j>=4;j--) {
					int check = 0;
					while(check < 5) {
						if(arr[i+check][j-check] == 'o') {
							check++;
						}else
							break;
					}
					if(check == 5) 
						flag = true;
				}
			}
			
			if(flag)
				System.out.println("#"+test_case+" YES");
			else
				System.out.println("#"+test_case+" NO");
		}
	}
}