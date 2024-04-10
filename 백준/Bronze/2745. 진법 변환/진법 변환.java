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
		String str = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i = 0;i<str.length();i++) {
			int a = 0;
			if(str.charAt(i) - 'A' < 0)
				a = str.charAt(i) - '0';
			else
				a = str.charAt(i) - 'A' + 10;
			
			sum += a * (Math.pow(n, str.length() - i - 1));
		}
		
		sb.append(sum);
		System.out.println(sb);
	}
}