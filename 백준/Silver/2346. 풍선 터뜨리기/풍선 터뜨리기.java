import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<int[]> d = new ArrayDeque<>();

		for(int i=1;i<=n;i++) {
			d.addLast(new int[] {i,Integer.parseInt(st.nextToken())});
		}
		
		for(int i=0;i<n;i++) {
			int[] value = d.pollFirst();
			sb.append(value[0] + " ");
			if(!d.isEmpty()) {
				if(value[1] > 0) {
					for(int j=0;j<value[1]-1;j++) {
						d.addLast(d.pollFirst());
					}
				}else {
					value[1] = Math.abs(value[1]);
					for(int j=0;j<value[1];j++) {
						d.addFirst(d.pollLast());
					}
				}
			}
		}
		System.out.println(sb);
	}
}