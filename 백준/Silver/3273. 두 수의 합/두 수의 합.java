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
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		System.out.println(to(arr,x,0,arr.length -1));
	}
	static int to(int[] arr,int x,int start,int end) {
		int count = 0;
		
		while(start < end) {
			if(arr[start] + arr[end] == x) {
				count++;
				start++;
				end--;
			}
			else if(arr[start] + arr[end] < x) {	
				start++;
			}else
				end-- ;
		}
		
		return count;
	}
}

