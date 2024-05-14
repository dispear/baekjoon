import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] change = new int[n];
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		change = arr.clone();
		Arrays.sort(change);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<change.length;i++) {
			if(!hm.containsKey(change[i])) {
				hm.put(change[i], cnt++);
			}
		}
		for(int i=0;i<n;i++) {
			sb.append(hm.get(arr[i])+" ");
		}
		System.out.println(sb);
	}
}