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
		boolean[][] arr = new boolean[100][100];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k] = true;
				}
			}
		}
		
		int sum = 0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(arr[i][j])
					sum++;
			}
		}
		
		sb.append(sum);
		System.out.println(sb);
	}
}