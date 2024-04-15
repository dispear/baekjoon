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
		int[] arr = new int[n];
		int[] s = new int[n];
		int result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i == 0)
				s[i] = arr[i];
			else
				s[i] = arr[i] + s[i-1];
		}
		
		for(int i = 0;i<n;i++) {
			result += s[i];
		}
		
		sb.append(result);
		System.out.println(sb);
	}
}