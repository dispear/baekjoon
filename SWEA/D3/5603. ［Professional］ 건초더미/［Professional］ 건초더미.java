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
			int[] arr = new int[n];
			int cnt = 0;
			int eq = 0;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				eq += arr[i];
			}
			eq = eq / n;
			
			for(int i=0;i<n;i++) {
				cnt += Math.abs(arr[i] - eq);
			}
			
			System.out.println("#"+test_case+" "+cnt/2);
		}
	}
}
