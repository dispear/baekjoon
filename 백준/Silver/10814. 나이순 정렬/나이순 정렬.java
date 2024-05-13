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
		Info[] f = new Info[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			f[i] = new Info(age,name);
		}
		
		Arrays.sort(f, new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				// TODO Auto-generated method stub
				return o1.age-o2.age; 
			}
		});
		
		for(int i=0;i<n;i++) {
			sb.append(f[i].age+" "+f[i].name+"\n");
		}
		System.out.println(sb);
	}
	static class Info {
		int age;
		String name;
		Info(int age,String name){
			this.age = age;
			this.name = name;
		}
	}
}