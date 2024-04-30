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
			double avg = 0;
			
			for(int i=0;i<n;i++) {
				avg += sc.nextDouble() * sc.nextDouble();
			}

			System.out.println("#"+test_case+" "+avg);
		}
	}
}
