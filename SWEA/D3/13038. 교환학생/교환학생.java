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
			int week = 0;
			int[] arr = new int[7];
			
			for(int i=0;i<7;i++) {
				arr[i] = sc.nextInt();
				if(arr[i] == 1)
					week++;
			}
			
			int min = Integer.MAX_VALUE;
			for(int i=0;i<7;i++) {
				int daycount = n;
				int day = 0;
				int check =0;
				
				if(arr[i] == 1) {
					for(int j=i;j<7;j++) {
						day++;
						if(arr[j] == 1) {
							daycount--;
							check = j;
						}
							
						if(daycount == 0)
							break;
					}
					
					// 2주차 부터
					if(daycount != 0) {
						if(daycount > week) {
							day += 7 * (daycount / week);
							daycount %= week;
							if(daycount == 0) {
								day -= 6 - check;
							}
						}
						
						for(int j=0;j<7;j++) {
							if(daycount == 0)
								break;
							day++;
							if(arr[j] == 1)
								daycount--;
						}
					}
					min = Math.min(min, day);
				}
			}
			System.out.println("#"+test_case+" "+min);
		}
	}
}
