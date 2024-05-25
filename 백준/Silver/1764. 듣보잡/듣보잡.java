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

		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			set1.add(st.nextToken());
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(set1.contains(s)){
				set2.add(s);
				cnt++;
			}
		}
		
		ArrayList<String> arr = new ArrayList<>(set2);
		Collections.sort(arr);
		sb.append(cnt+"\n");
		for(String s:arr) {
			sb.append(s+"\n");
		}
		
		System.out.println(sb);
	} 
}