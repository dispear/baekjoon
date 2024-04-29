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
			String s = sc.next();
			int cnt = 0;
			boolean[] arr = new boolean[10];
			
			for(int i=0;i<s.length();i++) {
				int a = s.charAt(i) - '0';
				if(!arr[a]) {
					arr[a] = true;
					cnt++;
				}else {
					arr[a] = false;
					cnt--;
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
