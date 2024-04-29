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
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			
			double s1 = (1-p);
			double s2 = p * (1-q);
				
			if(s1 < s2) {
				System.out.println("#"+test_case+" "+"YES");
			}else {
				System.out.println("#"+test_case+" "+"NO");
			}	
		}
	}
}