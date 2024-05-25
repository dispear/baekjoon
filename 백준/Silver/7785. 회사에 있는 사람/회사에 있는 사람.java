import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		HashMap<String, String> hm = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String s = st.nextToken();
			
			if(hm.containsKey(name)) {
				hm.remove(name);
			}else {
				hm.put(name, s);
			}
		}
		
		ArrayList<String> arr = new ArrayList<>(hm.keySet());
		Collections.sort(arr, Collections.reverseOrder());
		
		for(String s:arr) {
			sb.append(s+"\n");
		}
		
		System.out.println(sb);
	} 

}