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
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long g = 0;

		if (a > b)
			g = gcd(a, b);
		else
			g = gcd(b, a);

		sb.append(a * b / g + "\n");

		System.out.println(sb);
	}

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}