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
		
		for(int i=0;i<n;i++) {
			Stack<Character> s = new Stack<Character>();
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
					
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);

				if(c == '(') {
					s.add('(');
				}else {
					if(!s.isEmpty()) {
						if(s.peek() == '(')
							s.pop();
						else
							s.add(c);
					}else
						s.add(c);
				}
			}
			
			if(s.isEmpty())
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		
		System.out.println(sb);
	}
}