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
			int result = 0;
			
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=1;i<n-1;i++) {
				int max = 0;
				int min = n+1;
				for(int j=i-1;j<=i+1;j++) {
					if(arr[j] > max)
						max = arr[j];
					if(arr[j] < min)
						min = arr[j];
				}
				if(max != arr[i] && min != arr[i])
					result++;
			}		
			System.out.println("#"+test_case+" "+result);	
		}
	}
}
