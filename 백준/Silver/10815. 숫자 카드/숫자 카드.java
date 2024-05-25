import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		HashSet<Integer> hs = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			hs.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(hs.contains(a))
				sb.append("1 ");
			else
				sb.append("0 ");
		}

		System.out.println(sb);
	} 

}