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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = 0;
			int min = 0;
			
			max = Math.min(a, b);
			if(n < a+b)
				min = a+b - n;
			
			System.out.println("#"+test_case+" "+max+" "+min);
		}
	}
}
