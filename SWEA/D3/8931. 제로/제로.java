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
			Stack<Integer> s = new Stack<>();
			
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				
				if(a == 0) {
					s.pop();
				}else {
					s.push(a);
				}
			}
			
			for(int i=0;i<s.size();i++) {
				count += s.get(i);
			}
			
			System.out.println("#"+test_case+" "+count);
		}
	}
}
