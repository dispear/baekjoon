import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			switch (a) {
			case 1: {
				int x = Integer.parseInt(st.nextToken());
				q.addFirst(x);
				break;
			}
			case 2: {
				int x = Integer.parseInt(st.nextToken());
				q.addLast(x);
				break;
			}
			case 3: {
				if(!q.isEmpty())
					sb.append(q.pollFirst()+"\n");
				else
					sb.append(-1+"\n");
				break;
			}
			case 4: {
				if(!q.isEmpty())
					sb.append(q.pollLast()+"\n");
				else
					sb.append(-1+"\n");
				break;
			}
			case 5: {
				sb.append(q.size()+"\n");
				break;
			}
			case 6: {
				if(!q.isEmpty())
					sb.append(0+"\n");
				else
					sb.append(1+"\n");
				break;
			}
			case 7: {
				if(!q.isEmpty())
					sb.append(q.peekFirst()+"\n");
				else
					sb.append(-1+"\n");
				break;
			}
			case 8: {
				if(!q.isEmpty())
					sb.append(q.peekLast()+"\n");
				else
					sb.append(-1+"\n");
				break;
			}
			default:
				break;
			}
		}
		
		System.out.println(sb);
	}
}