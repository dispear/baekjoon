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
			int cnt = 0;
			char c = 'A';
			String[] s = new String[n];
			
			for(int i=0;i<n;i++) {
				s[i] = sc.next();
			}
			
			while(true) {
				boolean flag = false;
				for(int i=0;i<n;i++) {
					if(s[i].charAt(0) == c) {
						cnt++;
						flag = true;
						c = (char) (c + 1);
						break;
					}
				}
				if(!flag)
					break;
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
