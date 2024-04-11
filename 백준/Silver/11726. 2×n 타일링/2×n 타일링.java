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
		int[] arr = new int[n+1];
				
		for(int i = 1;i<=n;i++) {
			if(i == 1 || i == 2)
				arr[i] = i;
			else
				arr[i] = (arr[i-2] + arr[i-1]) % 10007;
		}
		sb.append(arr[n]);
		System.out.println(sb);
	}
}