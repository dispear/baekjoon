import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{
	static int win, lose;
	static int[] arr;
	static boolean[] selected;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			arr = new int[9];
			selected = new boolean[19];
			win = 0;
			lose = 0;
			
			for(int i=0;i<9;i++) {
				arr[i] = sc.nextInt();
				selected[arr[i]] = true;
			}
			
			game(0,0);
			System.out.println("#"+test_case+" "+win+" "+lose);
		}
	}
	static void game(int cnt,int sum) {
		if(cnt == 9) {
			if(sum > 171 - sum)
				win++;
			else
				lose++;
			return;
		}else {
			for(int i=1;i<=18;i++) {
				if(selected[i]) 
					continue;
				
				selected[i] = true;
				
				if(arr[cnt] > i)
					game(cnt+1,sum+i+arr[cnt]);
				else
					game(cnt+1,sum);
					
				selected[i] = false;
			}
		}
	}
}
