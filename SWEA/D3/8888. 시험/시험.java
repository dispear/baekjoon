import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{	
	public static void main(String args[]) throws Exception
	{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sto = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(sto.nextToken());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sto = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(sto.nextToken());
			int t = Integer.parseInt(sto.nextToken());
			int p = Integer.parseInt(sto.nextToken())-1;
			
			int[] ans = new int[t]; // 문제들의 점수
			int[][] st  = new int[n][3]; /// 수험자의 데이터
			int[][] arr = new int[n][t]; // 정답 여부
			
			for(int i=0;i<n;i++) {
				sto = new StringTokenizer(br.readLine());
				for(int j=0;j<t;j++) {
					int a = Integer.parseInt(sto.nextToken());
					arr[i][j] = a;
					if(a == 0)
						ans[j]++;
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<t;j++) {
					if(arr[i][j] == 1) {
						st[i][0] += ans[j]; // 점수	
						st[i][2]++; // 푼 개수
					}	
				}
			}
			
			st[p][1] = 1; // 등수 초기화
			for(int i=0;i<n;i++) {
				if(i == p)
					continue;
				
				if(st[i][0] > st[p][0])
					st[p][1]++;
				else if(st[i][0] == st[p][0]){
					if(st[i][2] > st[p][2])
						st[p][1]++;
					else if(st[i][2] == st[p][2]) {
						if(p > i)
							st[p][1]++;
					}
				}
			}
			
			sb.append("#");
			sb.append(test_case+" ");
			sb.append(st[p][0]+" ");
			sb.append(st[p][1]+"\n");
		}
		System.out.println(sb);
	}
}
