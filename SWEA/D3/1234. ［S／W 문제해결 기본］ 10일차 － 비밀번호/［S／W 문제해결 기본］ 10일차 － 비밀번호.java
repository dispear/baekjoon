import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			String str = sc.next();
			int a = 0;
			
			while(true) {
				if(a >= str.length() - 1) {
					break;
				}
				if(str.charAt(a) == str.charAt(a+1)) {
					if(a != 0) {
						str = str.substring(0,a) + str.substring(a+2,str.length());
						a = 0;
					}else {
						str = str.substring(a+2,str.length());
						a = 0;
					}	
				}else
					a++;
			}
			
			System.out.println("#"+test_case+" "+str);
		}
	}
}