import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<>();
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			hs.add(st.nextToken());
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			if(hs.contains(st.nextToken()))
				cnt++;
		}

		System.out.println(cnt);
	} 

}