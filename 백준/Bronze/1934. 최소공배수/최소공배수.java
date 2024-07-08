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
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int g = 0;
			
			if(a > b)
				g = gcd(a,b);
			else
				g = gcd(b,a);
			
			sb.append(a*b/g + "\n");
		}
		
		System.out.println(sb);
	}
	static int gcd(int a,int b) {
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
}