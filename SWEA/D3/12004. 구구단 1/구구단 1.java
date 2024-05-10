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
			boolean b = false;
			for(int i=1;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					if(n == i*j) {
						b = true;
						break;
					}
				}
				if(b) {
					break;
				}
			}
			
			if(b)
				System.out.println("#"+test_case+" Yes");
			else
				System.out.println("#"+test_case+" No");
		}
	}
}
