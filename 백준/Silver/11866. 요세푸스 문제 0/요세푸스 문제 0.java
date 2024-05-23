import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		
		sb.append("<");
		while(!q.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				int a = q.poll();
				q.add(a);
			}
			sb.append(q.poll());
			if(!q.isEmpty())
				sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}
}
