import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long n = Integer.parseInt(st.nextToken());
		long sum = 0;
		for(int i=1;i<n;i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(2);
	}
	
}