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
			int k = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int result = 0;
			for(int i=0;i<k;i++) {
				result += arr[n-1-i];
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
}