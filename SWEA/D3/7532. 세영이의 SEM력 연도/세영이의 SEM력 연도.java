import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{
	static int[][] visited;
	static int[][] arr;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {-1,1,0,0};
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			int m = sc.nextInt();
			int counts = 0;
			int counte = 0;
			int countm = 0;
			int result = 0;
			
			while(true) {
				if(s == counts && e == counte && m == countm)
					break;
				
				counts++;
				counte++;
				countm++;
				if(counts == 366)
					counts = 1;
				if(counte == 25)
					counte = 1;
				if(countm == 30)
					countm = 1;
				
				result++;
			}

			System.out.println("#"+test_case+" "+result);	
		}
	}
}
