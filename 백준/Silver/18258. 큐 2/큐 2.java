import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				push(x,q);
			}else if(str.equals("pop")) {
				pop(q);
			}else if(str.equals("size")) {
				size(q);
			}else if(str.equals("empty")) {
				empty(q);
			}else if(str.equals("front")) {
				front(q);
			}else if(str.equals("back")) {
				back(q);
			}
		}
		
		System.out.println(sb);
	}
	static void push(int x, Deque<Integer> q) {
		q.add(x);
	}
	static void pop(Deque<Integer> q) {
		if(q.isEmpty())
			sb.append(-1+"\n");
		else {
			int a = q.poll();
			sb.append(a+"\n");
		}	
	}
	static void size(Deque<Integer> q) {
		sb.append(q.size()+"\n");
	}
	static void empty(Deque<Integer> q) {
		if(q.isEmpty())
			sb.append(1+"\n");
		else
			sb.append(0+"\n");
	}
	static void front(Deque<Integer> q) {
		if(q.isEmpty())
			sb.append(-1+"\n");
		else
			sb.append(q.peekFirst()+"\n");
	}
	static void back(Deque<Integer> q) {
		if(q.isEmpty())
			sb.append(-1+"\n");
		else
			sb.append(q.peekLast()+"\n");
	}
}