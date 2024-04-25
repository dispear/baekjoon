import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int line;
	static int n;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] arr= new int[n+1];
		int[] sarr = new int[n+1];
		line = Integer.MAX_VALUE;
		
		sarr[0] = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i==1)
				sarr[i] = arr[i];
			else
				sarr[i] = sarr[i-1] + arr[i];
		}

		pointer(sarr,s,0,1);
		
		if(line == Integer.MAX_VALUE)
			line = 0;
		
		System.out.println(line);
	}
	static void pointer(int[] sarr,int s,int start,int end) {
		if(end > n) {
			return;
		}else {
			if(sarr[end] - sarr[start] < s) {
				pointer(sarr,s,start,end+1);
			}else {
				line = Math.min(line, end-start);
				pointer(sarr,s,start+1,end);
			}
		}
	}
}