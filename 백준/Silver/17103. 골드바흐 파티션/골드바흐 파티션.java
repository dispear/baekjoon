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
		int t = Integer.parseInt(st.nextToken());
		LinkedList<Integer> list = new LinkedList<Integer>();
		int[] arr = new int[1000001];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2;i<Math.sqrt(1000001);i++) {
			if(arr[i] == 0) {
				int a = i * 2;
				while(a < 1000001) {
					arr[a] = 1;
					a = a + i;
				}
			}
		}
		
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			for(int j=2;j<= n/2;j++) {
				if(arr[j] == 0) {
					if(arr[n-j] == 0) {
						sum++;
					}
				}
			}
			
			sb.append(sum+"\n");
		}
		
		System.out.println(sb);
	}
}