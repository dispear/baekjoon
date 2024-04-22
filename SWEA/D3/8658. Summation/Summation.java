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
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<10;i++) {
				int a = sc.nextInt();
				int sum = 0;
				
				while(a > 0) {
					sum += a % 10;
					a /= 10;
				}
				if(sum > max)
					max = sum;
				if(sum < min)
					min = sum;
			}
				
			System.out.println("#"+test_case+" "+max+" "+min);
		}
	}
}