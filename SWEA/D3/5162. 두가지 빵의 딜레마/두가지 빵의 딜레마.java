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
			int sum = 0;
			
			if(a > b) {
				sum += c / b;
				c = c % b;
				if(c / a != 0)
					sum += c/a;
			}else {
				sum += c / a;
				c = c % a;
				if(c / b != 0)
					sum += c/b;
			}

			System.out.println("#"+test_case+" "+sum);
		}
	}
}
