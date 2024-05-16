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
			long n = sc.nextLong();
			int d = sc.nextInt();
			int g = sc.nextInt();
			boolean b = true;
			
			if(d != 0 && g == 0)
				b = false;
			
			if(d != 100 && g == 100)
				b = false;
			
			int a = 100;
			if(d % 4 == 0)
				a = a /4;
			else if(d % 2 == 0)
				a = a /2;
			
			if(d % 25 == 0)
				a = a /25;
			else if(d % 5 == 0)
				a = a/5;
			
			if(n < a)
				b = false;
				
			if(b)
				System.out.println("#"+test_case+" Possible");
			else
				System.out.println("#"+test_case+" Broken");
		}
	}
}
