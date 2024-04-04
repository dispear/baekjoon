import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[1000001];
		
		arr[1]=true;
		for(int i=2;i<=Math.sqrt(m);i++) {
			if(!arr[i]) {
				int a = i*2;
				while(a<=m) {
					arr[a] = true;
					a = a+i;
				}
			}
		}
		for(int i=n;i<=m;i++) {
			if(!arr[i])
				sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}