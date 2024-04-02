import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		int[] s = new int[n];
		long[] arr = new long[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(i == 0) {
				s[i] = a;
			}else {
				s[i] = s[i-1] + a;
			}
			s[i] %= m;
			arr[s[i]]++;
		}
		
		// 구간 개수 구하기
		long sum = arr[0];
		for(int i=0;i<m;i++) {
			if(arr[i]>=2) {
				sum += (arr[i] * (arr[i]-1))/2;
			}
		}
		sb.append(sum);
		System.out.println(sum);
	}
}