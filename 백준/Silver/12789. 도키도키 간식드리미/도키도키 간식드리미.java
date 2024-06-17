import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int now = 1;
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			s2.push(Integer.parseInt(st.nextToken()));
		}
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		while(!s1.isEmpty()) {
			if(now == s1.peek()) {
				now++;
				s1.pop();
			}else if(!s2.isEmpty() && s2.peek() == now) {
				now++;
				s2.pop();
			}else
				s2.push(s1.pop());
		}
		while(!s2.isEmpty()) {
			if(now == s2.peek()) {
				now++;
				s2.pop();
			}else {
				break;
			}
		}
		
		if(now == n+1) {
			System.out.println("Nice");
		}else
			System.out.println("Sad");
		
	}
}
