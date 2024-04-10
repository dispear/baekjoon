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
		int sum = 2;
		int a = 1;
		
		for(int i=0;i<n;i++) {
			sum += a;
			a = a*2;
		}
		sb.append(sum * sum);
		System.out.println(sb);
	}
}
