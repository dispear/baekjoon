import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		
		sb.append(c(n,m));
		System.out.println(sb);
	}
	
	static int c(int n1,int n2) {
		if(n1 == n2 || n2 == 0) {
			return arr[n1][n2] = 1;
		}
		else if(n2 == 1) {
			return arr[n1][n2] = n1;
		}else {
			return arr[n1][n2] = c(n1-1,n2) + c(n1-1,n2-1);
		}
	}
}