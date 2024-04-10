import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = 0;
		int sum = 0;
		
		while(sum + x <n) {
			sum += x;
			x++;
		}
		
		int a = n - sum;
		int b = (x+1) -a;
		
		if(x%2 == 0)
			sb.append(a + "/" + b);
		else
			sb.append(b + "/" + a);
		System.out.println(sb);
	}
}