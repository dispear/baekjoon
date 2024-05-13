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
			int[][] l = new int[n][2];
			
			for(int i=0;i<n;i++) {
				l[i][0] = sc.nextInt();
				l[i][1] = sc.nextInt();
			}
			Arrays.sort(l, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o1[0]-o2[0];
				}
			});
			
			int cnt = 0;
			for(int i=1;i<n;i++) {
				for(int j=0;j<i;j++) {
					if(l[j][1] > l[i][1])
						cnt++;
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
