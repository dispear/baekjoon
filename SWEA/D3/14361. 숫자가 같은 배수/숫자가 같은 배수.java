import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{	
	static boolean[] visited;
	static String result;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s = sc.next();
			visited = new boolean[s.length()];
			result = "impossible";
			
			back(s,0,"");
			
			System.out.println("#"+test_case+" "+result);	
		}
	}
	static void back(String s,int x,String str) {
		if(x >= s.length()) {
			if(Integer.parseInt(str) % Integer.parseInt(s) == 0 && Integer.parseInt(str) / Integer.parseInt(s) > 1)
				result = "possible";
			return;
		}	
		else {
			for(int i=0;i<s.length();i++) {
				if(!visited[i]) {
					visited[i] = true;
					back(s, x+1, str+s.charAt(i));
					visited[i] = false;
				}
			}
		}
	}
}
