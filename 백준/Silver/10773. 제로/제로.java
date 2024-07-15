import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> s = new Stack<Integer>();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			if(k == 0 ) {
				s.pop();
			}else {
				s.add(k);
			}
		}
		
		while(!s.isEmpty()) {
			sum += s.pop();
		}
		sb.append(sum);
		System.out.println(sb);
	}
}