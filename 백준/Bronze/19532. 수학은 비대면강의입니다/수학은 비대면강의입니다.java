import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		boolean flag = false;
		
		for(int x = -999;x<=999;x++) {
			for(int y = -999;y<=999;y++) {
				if(a*x + b*y == c && d*x + e*y == f) {
					flag = true;
					System.out.println(x+" "+y);
					break;
				}
			}
			if(flag)
				break;
		}
	}
}