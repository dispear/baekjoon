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
			String[] str = new String[5];
			String s = "";
			int size = 0;
			for(int i=0;i<5;i++) {
				str[i] = sc.next();
				size = Math.max(size, str[i].length());
			}
			
			for(int i=0;i<size;i++) {	
				for(int j=0;j<5;j++) {
					if(str[j].length() <= i)
						continue;
					else
						s += str[j].charAt(i);
				}
			}
			
			System.out.println("#"+test_case+" "+s);	
		}
	}
}
