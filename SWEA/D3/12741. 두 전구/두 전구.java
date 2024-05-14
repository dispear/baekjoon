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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int cnt = 0;
			int start = 0;
			int end = 0;
			
			if(a >= c) {
				start = a;
			}else
				start = c;
			if(b >= d)
				end = d;
			else
				end = b;
			
			if(end - start < 0)
				cnt = 0;
			else
				cnt = end - start;
					
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
