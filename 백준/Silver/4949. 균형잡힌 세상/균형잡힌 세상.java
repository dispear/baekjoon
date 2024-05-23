import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			Stack<Character> s = new Stack<>();
			char c = '0';
			int cnt = 0;
			boolean b = true;
			String str = br.readLine();

			if(str.equals("."))
				break;
			
			while(c != '.') {
				c = str.charAt(cnt);
				cnt++;
				
				if(c == '(' || c == '[') {
					s.add(c);
				}else if(c == ')') {
					char ch = '0';
					if(!s.isEmpty())
						ch = s.pop();			
					if(ch != '(') {
						b = false;
						break;
					}
				}else if(c == ']') {
					char ch = '0';
					if(!s.isEmpty())
						ch = s.pop();	
					if(ch != '[') {
						b = false;
						break;
					}
				}
			}
			if(!s.isEmpty())
				b = false;
			
			if(b)
				sb.append("yes\n");
			else
				sb.append("no\n");
		}
		
		System.out.println(sb);
	}
}
