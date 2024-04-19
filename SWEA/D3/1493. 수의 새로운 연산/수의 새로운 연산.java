import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[][] arr = new int[1001][1001];
			And[] d = new And[50001];
			int x = 1;
			int y = 1;
			int num = 1;
			
			for(int i=1;i<=50000;i++) {
				d[i] = new And(x,y);
				arr[y][x] = i;
				if(y == 1) {
					num++;
					y = num;
					x = 1;
				}else {
					y--;
					x++;
				}
			}
			
			int result = arr[d[a].y + d[b].y][d[a].x + d[b].x];

			System.out.println("#"+test_case+" "+result);
		}
		
	}
	static class And { 
		int x;
		int y;
		
		And(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}