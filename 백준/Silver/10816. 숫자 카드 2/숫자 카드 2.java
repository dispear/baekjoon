import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(!map.containsKey(a))
				map.put(a, 1);
			else {
				int cnt = map.get(a);
				map.remove(a);
				map.put(a, cnt+1);
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(!map.containsKey(a))
				sb.append("0 ");
			else {
				sb.append(map.get(a)+" ");
			}
		}
		
		System.out.println(sb);
	} 

}