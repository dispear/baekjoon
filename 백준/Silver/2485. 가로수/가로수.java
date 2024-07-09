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
		int[] arr = new int[n];
		int g = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n-1;i++) {
			int d = arr[i+1] - arr[i];
			if(g>d) {
				g = gcd(g,d);
			}else {
				g = gcd(d,g);
			}
		}
		
		int tree = (arr[n-1] - arr[0])/g - n + 1;
		
		sb.append(tree);

		System.out.println(sb);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}