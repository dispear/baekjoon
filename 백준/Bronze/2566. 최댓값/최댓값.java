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
		
		int n = 0;
		int m = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(max < num) {
					max = num;
					n = i+1;
					m = j+1;
				}
			}
		}
		sb.append(max + "\n");
		sb.append(n + " " + m);
		System.out.println(sb);
	}
}