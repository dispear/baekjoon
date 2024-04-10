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
		
		char[][] arr = new char[5][15];
		String str = "";
		
		for(int i = 0;i<5;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			for(int j=0;j<s.length();j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(arr[j][i] == 0)
					continue;
				else
					str += arr[j][i];
			}
		}
		
		sb.append(str);
		System.out.println(sb);
	}
}