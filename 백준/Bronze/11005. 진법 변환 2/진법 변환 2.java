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
		int b = Integer.parseInt(st.nextToken());
		String str = "";
		
		while(n>0) {
			int a = n % b;
			n /= b;
			
			if(a>9) {
				char c = (char) ('A' + a - 10);
				str += c;
			}else
				str += a;
		}
		
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}
}