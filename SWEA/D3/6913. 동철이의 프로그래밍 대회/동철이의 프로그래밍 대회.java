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
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				int count = 0;
				for(int j=0;j<m;j++) {
					if(sc.nextInt() == 1)
						count++;
				}
				arr[i] = count;
			}
			
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i] < arr[j]) {
						int tmp = 0;
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			int result1 = 1;
			int result2 = arr[0];
			for(int i=0;i<n-1;i++) {
				if(arr[result1] != arr[0])
					break;
				
				result1++;
			}
					
			System.out.println("#"+test_case+" "+result1+" "+result2);
		}
	}
}