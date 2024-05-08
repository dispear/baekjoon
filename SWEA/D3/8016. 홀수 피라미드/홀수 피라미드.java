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
			long n = sc.nextInt();
			
			long result1 = 2*(n-1)*(n-1) +1;
			long result2 = 2*n*n -1;
			
			System.out.println("#"+test_case+" "+result1+" "+result2);	
		}
	}
}
