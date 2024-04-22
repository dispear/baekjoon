import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			String first = sc.next();
			String second = sc.next();
			int result = 0;
			
			for(int i=0;i<a;i++) {
				if(first.charAt(i) == second.charAt(i))
					result++;
			}
			
			System.out.println("#"+test_case+" "+result);
		}
		
	}
}