import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];
		for(int i=0;i<=n;i++) {
			arr[i] = i;
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0) {
				union(arr,b,c);
			}else {
				if(find(arr,b) == find(arr,c)) {
					System.out.println("YES");
				}else
					System.out.println("NO");
			}
		}
	}
	
	static void union(int[] arr,int n1,int n2) {
		arr[find(arr,n1)] = arr[find(arr,n2)];
	}
	static int find(int[] arr,int n) {
		if(n == arr[n])
			return n;
		else {
			int a = find(arr,arr[n]);
			arr[n] = a;
			return a;
		}
	}
}