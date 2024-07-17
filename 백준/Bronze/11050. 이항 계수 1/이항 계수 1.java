import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int result = con(n,m);
		
		sb.append(result);
		System.out.println(sb);
	}
	static int con(int n, int m) {
		if(n == m || m == 0) {
			return 1;
		}
		else if(m == 1) {
			return n;
		}
		else {
			return con(n-1,m-1)+con(n-1,m);
		}
	}
}