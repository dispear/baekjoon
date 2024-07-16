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
		
		int[] arr = new int[250000];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2;i<Math.sqrt(250000);i++) {
			if(arr[i] == 0) {
				int a = i * 2;
				while(a < 250000) {
					arr[a] = 1;
					a = a + i;
				}
			}
		}
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			if(n == 0)
				break;
			
			for(int i=n+1;i<=2*n;i++) {
				if(arr[i] == 0)
					sum++;
			}
			
			sb.append(sum+"\n");
		}
		
		System.out.println(sb);
	}
}