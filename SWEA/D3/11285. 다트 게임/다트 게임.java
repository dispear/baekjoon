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
			int count = 0;
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				double c = Math.sqrt(a*a + b*b);
				if(c>200)
					continue;
				
				if(c <= 20)
					count += 10;
				else if(c <= 40)
					count += 9;
				else if(c <=60)
					count += 8;
				else if(c <= 80)
					count +=7;
				else if(c <= 100)
					count += 6;
				else if(c <= 120)
					count += 5;
				else if(c <= 140)
					count += 4;
				else if(c <= 160)
					count += 3;
				else if(c <= 180)
					count += 2;
				else if(c <= 200)
					count += 1;
			}

			System.out.println("#"+test_case+" "+count);
		}
	}
}
