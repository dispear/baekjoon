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
			String[] s = new String[n];
			int sum = 0;
			int left = 0;
			int right = 0;
			
			for(int i=0;i<n;i++) {
				s[i] = sc.next();
			}
			
			for(int i=0;i<n;i++) {
				if(i<=n/2) {
					left = n/2 - i;
					right = n/2 + i;
				}else {
					left = i - n/2;
					right = n/2 + n - i - 1;
				}
				
				for(int j=left;j<=right;j++) {
					sum += s[i].charAt(j) -'0';
				}
			}
						
			System.out.println("#"+test_case+" "+sum);
		}
	}
}
