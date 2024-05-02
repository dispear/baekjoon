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
			String[] str = new String[n];
			
			for(int i=0;i<n;i++) {
				str[i] = sc.next();
			}
			
			System.out.print("#"+test_case+" ");
			if(n%2==0) {
				for(int i=0;i<n/2;i++) {
					System.out.print(str[i] + " ");
					System.out.print(str[i+(n/2)]+" ");
				}
			}else {
				for(int i=0;i<n/2;i++) {
					System.out.print(str[i] + " ");
					System.out.print(str[i+(n/2)+1]+" ");

				}
				System.out.print(str[n/2] + " ");
			}
			
			System.out.println();
		}
	}
}
