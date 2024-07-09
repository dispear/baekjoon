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
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		int n1 = a1 * b2 + a2 * b1;
		int n2 = b1*b2;
		int g = 0;
		
		if(n1 > n2) {
			g = gcd(n1,n2);
		}else {
			g = gcd(n2,n1);
		}
		
		sb.append(n1/g + " " + n2/g);

		System.out.println(sb);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}