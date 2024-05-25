import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();

		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String s = str.substring(i,j+1);
				set.add(s);
			}
		}
		
		System.out.println(set.size());
	} 
}