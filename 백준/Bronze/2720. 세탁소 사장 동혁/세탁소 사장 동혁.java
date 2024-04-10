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
		int a = Integer.parseInt(st.nextToken());

		for(int i=0;i<a;i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			if(c >= 25) {
				q = c / 25;
				c %= 25;
			}
			if(c >= 10) {
				d = c / 10;
				c %= 10;
			}
			if(c >= 5) {
				n = c / 5;
				c %= 5;
			}
			if(c >= 1) {
				p = c / 1;
			}
			sb.append(q + " " + d + " " + n + " " + p + "\n");
		}
		
		System.out.println(sb);
	}
}