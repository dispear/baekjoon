import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{	
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n,m;
	static String[] str;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
			m =	sc.nextInt();
			str = new String[n];

			for(int i=0;i<n;i++) {
				str[i] = sc.next();
			}
			
			if(f('#') || f('.'))
				System.out.println("#"+test_case+" "+"possible");
			else
				System.out.println("#"+test_case+" "+"impossible");	
		}
	}
	static boolean f(char c) {
		if(c == '#') {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if((i+j)%2==0) {
						if(str[i].charAt(j) == '.')
							return false;
					}else {
						if(str[i].charAt(j) == '#')
							return false;
					}
				}
			}
		}else if(c == '.') {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if((i+j)%2==0) {
						if(str[i].charAt(j) == '#')
							return false;
					}else {
						if(str[i].charAt(j) == '.')
							return false;
					}
				}
			}
		}
		
		return true;
	}
}
