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
			int n = sc.nextInt();
			String str = "";
			int[] arr = new int[s.length()+1];
			
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				arr[a]++;
			}
			
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<arr[i];j++) {
					str += "-";
				}
				str += s.charAt(i);
			}
			for(int j=0;j<arr[s.length()];j++) {
				str += "-";
			}
	
			System.out.println("#"+test_case+" "+str);	
		}
	}
}
