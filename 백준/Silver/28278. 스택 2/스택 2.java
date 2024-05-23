import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			switch (a) {
			case 1:
				int b = Integer.parseInt(st.nextToken());
				s.add(b);
				break;
			case 2:
				if(!s.empty())
					sb.append(s.pop()+"\n");
				else
					sb.append("-1\n");
				break;
			case 3:
				sb.append(s.size()+"\n");
				break;
			case 4:
				if(!s.empty())
					sb.append("0\n");
				else
					sb.append("1\n");
				break;
			case 5:
				if(!s.empty())
					sb.append(s.peek()+"\n");
				else
					sb.append("-1\n");
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}
