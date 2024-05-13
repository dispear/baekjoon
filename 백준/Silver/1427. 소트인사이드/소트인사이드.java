import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		Integer[] arr = new Integer[s.length()];
			
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0;i<s.length();i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}