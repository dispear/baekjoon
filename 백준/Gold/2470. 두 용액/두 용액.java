import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int result1, result2;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		result1 = 0;
		result2 = 0;
		int x = Integer.MAX_VALUE;
		to(arr,x,0,arr.length-1);
		
		System.out.println(result1+" "+result2);
	}
	static void to(int[] arr,int x,int start,int end) {
		if(start >= end)
			return;
		else {
			
			if(Math.abs(x) > Math.abs(arr[start] + arr[end])) {
				x = arr[start] + arr[end];
				result1 = arr[start];
				result2 = arr[end];
			}
			
			if(arr[start] + arr[end] < 0) {
				to(arr,x,start+1,end);
			}else if(arr[start] + arr[end] > 0) {
				to(arr,x,start,end-1);
			}else
				return;
		}
	}
}

