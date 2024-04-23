import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n+m+1];
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++) {
					arr[i+j] += 1;
				}
			}
			
			int max = 0;
			for(int i=1;i<=n+m;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=1;i<=n+m;i++) {
				if(max == arr[i])
					sb.append(i+" ");
			}
			
			System.out.println("#"+test_case+" "+sb);
		}
	}
}