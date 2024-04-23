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
			int result = 0;
			int[] arr = new int[5];
			for(int i=0;i<5;i++) {
				arr[i] = sc.nextInt();
				if(arr[i] <40)
					arr[i] = 40;
				
				result += arr[i];
			}
			
			System.out.println("#"+test_case+" "+result/5);
		}
	}
}