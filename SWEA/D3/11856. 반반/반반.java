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
			String str = sc.next();
			String result = "No";
			char x = str.charAt(0);
			char y = 0;
			
			if(x != str.charAt(1)) {
				y = str.charAt(1);
				
				if(x == str.charAt(2) && y == str.charAt(3))
					result = "Yes";
				if(x == str.charAt(3) && y == str.charAt(2))
					result = "Yes";
			}else {
				y = str.charAt(2);
				
				if(y == str.charAt(3) && x != y)
					result = "Yes";
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
}
