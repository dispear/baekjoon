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
			char[] arr = new char[s.length()];
			boolean[] b = new boolean[s.length()];
			
			for(int i=0;i<s.length();i++) {
				arr[i] = s.charAt(i);
			}
			Arrays.sort(arr);
			
			for(int i=0;i<s.length()-1;i++) {
				if(b[i])
					continue;
				
				for(int j=i+1;j<s.length();j++){
					if(arr[i] == arr[j]) {
						b[i] = true;
						b[j] = true;
						break;
					}
				}
			}
			
			String str = "";
			for(int i=0;i<s.length();i++) {
				if(!b[i])
					str += arr[i];
			}
			
			if(str.equals(""))
				System.out.println("#"+test_case+" Good");
			else
				System.out.println("#"+test_case+" "+str);
		}
	}
}
