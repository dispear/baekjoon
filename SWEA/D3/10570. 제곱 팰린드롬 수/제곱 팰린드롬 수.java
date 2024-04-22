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
			int b = sc.nextInt();

			int result = 0;
			
			for(int i=a;i<=b;i++) {
				if(f(Integer.toString(i),0,Integer.toString(i).length() - 1)) {
					int r = (int) Math.sqrt(i);
					if(Math.pow(r, 2) == i) {
						if(f(Integer.toString(r),0,Integer.toString(r).length() - 1))
							result++;
					}
				}
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
	static boolean f(String s,int start, int end) {
		if(start>end)
			return true;
		if(s.charAt(start) == s.charAt(end))
			return f(s,start+1,end-1);
		
		return false;
	}
}
