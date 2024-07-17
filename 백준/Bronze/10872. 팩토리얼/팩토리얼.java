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
		int a = pac(n);
		
		sb.append(a);
		System.out.println(sb);
	}
	static int pac(int x) {
		if(x <= 1)
			return 1;
		else
			return pac(x-1) * x;
	}
}