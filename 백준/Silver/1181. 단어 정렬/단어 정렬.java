import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			s[i]  = st.nextToken();
		}
		
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length()!=o2.length() ? o1.length()-o2.length() : o1.compareTo(o2);
			}
		});
		
		sb.append(s[0]+"\n");
		for(int i=1;i<n;i++) {
			if(!s[i].equals(s[i-1]))
				sb.append(s[i]+"\n");
		}
		System.out.println(sb);
	}
}