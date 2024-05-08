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
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double min = 0;
			
			double r1 = b - a;
			double r2 = c - b;
			if(r1 == r2)
				min = 0;
			else
				min = Math.abs(((a + c) / 2) - b);
			
			System.out.println("#"+test_case+" "+min);
		}
	}
}
