import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] left = new int[n];
		int[] right = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			left[i] = 1;
			right[i] = 1;
		}
		
		for(int i=1;i<n;i++) {
			int a = i-1;
			while(a >= 0) {
				if(arr[i] > arr[a]) {
					left[i] = Math.max(left[i], left[a] + 1);
				}
				a--;
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			int a = i+1;
			while(a < n) {
				if(arr[i] > arr[a]) {
					right[i] = Math.max(right[i], right[a] + 1);
				}
				a++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max = Math.max(max, left[i] + right[i] - 1);
		}
		
		System.out.println(max);
	}
}