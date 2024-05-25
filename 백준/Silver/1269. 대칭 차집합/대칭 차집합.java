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

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			set1.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			set2.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i:set1) {
			if(!set2.contains(i))
				cnt++;
		}
		for(int i:set2) {
			if(!set1.contains(i))
				cnt++;
		}
		
		System.out.println(cnt);
	} 
}