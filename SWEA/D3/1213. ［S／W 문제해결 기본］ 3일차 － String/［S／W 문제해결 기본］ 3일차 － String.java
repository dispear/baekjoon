import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			String str = sc.next();
			String s = sc.next();
			int result = 0;

			int start = 0;
			
			while(true) {
				int a = s.indexOf(str, start);
				
				if(a == -1) {
					break;
				}else {
					result++;
					start = a+str.length();
				}
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
}