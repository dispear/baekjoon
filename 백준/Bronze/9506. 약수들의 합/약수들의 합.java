import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			if(n == -1)
				break;
			
			StringBuffer sb = new StringBuffer();
			sb.append(n + " = ");
			
			for(int i=1;i<n;i++) {
				if(n % i == 0) {
					sum += i;
					sb.append(i);
					if(sum != n)
						sb.append(" + ");
				}
				if(sum > n) {
					break;
				}
			}
			if(sum != n) {
				sb = new StringBuffer();
				sb.append(n + " is NOT perfect.");
			}
			
			System.out.println(sb);
		}
	}
}

