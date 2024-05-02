import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		int idx = 0;
		int num = 0;
		while(true) {
			if(idx == n)
				break;
			num++;
			
			for(int i=0;i<10;i++) {
				if(num/ (int)Math.pow(10, i) % 1000 == 666) {
					idx++;
					break;
				}
			}
		}

		System.out.println(num);
	}
}