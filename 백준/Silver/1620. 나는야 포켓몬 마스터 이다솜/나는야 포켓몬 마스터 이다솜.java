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
		HashMap<String, Integer> hm1 = new HashMap<>();
		HashMap<Integer, String> hm2 = new HashMap<>();
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			
			hm1.put(name, i);
			hm2.put(i, name);
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(hm1.containsKey(s)) {
				sb.append(hm1.get(s)+"\n");
			}else if(hm2.containsKey(Integer.parseInt(s))) {
				sb.append(hm2.get(Integer.parseInt(s))+"\n");
			}
		}
		
		System.out.println(sb);
	} 

}