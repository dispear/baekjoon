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
		Deque<Integer> d = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			
			if(a == 0)
				d.add(b);	
		}
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(st.nextToken());
			d.addFirst(a);
			int b = d.pollLast();
			sb.append(b+" ");
		}
		
		System.out.println(sb);
	}
}