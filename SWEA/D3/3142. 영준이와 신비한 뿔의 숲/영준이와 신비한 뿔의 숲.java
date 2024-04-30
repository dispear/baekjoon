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
			int m = sc.nextInt();
			int y = 0;
			int t = 0;
			
			for(int i=0;i<=m;i++) {
				if(i + (m-i) * 2 == n) {
					y = i;
					t = m - i;
					break;
				}
			}
		
			System.out.println("#"+test_case+" "+y+" "+t);
		}
	}
}
