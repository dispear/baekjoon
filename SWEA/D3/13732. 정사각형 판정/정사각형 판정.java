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
			char[][] arr = new char[n][n];
			int minX = -1;
			int minY = -1;
			int maxX = -1;
			int maxY = -1;
			for(int i=0;i<n;i++) {
				String s = sc.next();
				for(int j=0;j<n;j++) {
					char c = s.charAt(j);
					arr[i][j] = c;
					if(c == '#') {
						if(minX == -1 && minY == -1) {
							minY = i;
							minX = j;
						}
						maxY = i;
						maxX = j;
					}
				}
			}

			boolean b = true;
			if(maxY-minY != maxX-minX)
				b = false;
			
			for(int i=minY;i<=maxY;i++) {
				if(!b)
					break;
				for(int j=minX;j<=maxX;j++) {
					if(arr[i][j] == '.') {
						b = false;
						break;
					}
				}
			}
			
			if(b)
				System.out.println("#"+test_case+" yes");
			else
				System.out.println("#"+test_case+" no");
		}
	}
}
