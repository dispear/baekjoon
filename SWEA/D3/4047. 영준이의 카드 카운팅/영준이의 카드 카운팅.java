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
			int s = 13;
			int d = 13;
			int h = 13;
			int c = 13;
			boolean flag = true;
			int n = 0;
			ArrayList<String> arr = new ArrayList<>();
			
			while(n < str.length() ) {
				arr.add(str.substring(n,n+3));
				for(int i=0;i<arr.size()-1;i++) {
					if(arr.get(arr.size()-1).equals(arr.get(i))) {
						flag = false;
					}
				}
				switch (arr.get(arr.size()-1).charAt(0)) {
				case 'S':
					s--;
					break;
				case 'D':
					d--;
					break;
				case 'H':
					h--;
					break;
				case 'C':
					c--;
					break;
				}
				
				n = n +3;
			}
			
			if(flag)
				System.out.println("#"+test_case+" "+s+" "+d+" "+h+" "+c);	
			else
				System.out.println("#"+test_case+" ERROR");
			
		}
	}
}
