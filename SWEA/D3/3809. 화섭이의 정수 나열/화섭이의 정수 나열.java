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
			char[] arr = new char[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.next().charAt(0);
			}
			
			int a = 1;
			String result = "0";			
			while(true) {
				a = result.length();
				boolean b = false;
				
				for(int i=0;i<=n-a;i++) {
					String s = "";
					for(int j=i;j<i+a;j++) {
						  s = s + arr[j];
					}
					if(result.equals(s)) {
						result = Integer.toString(Integer.parseInt(result) + 1);
						b = true;
						break;
					}	
				}
				if(!b)
					break;
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
}
