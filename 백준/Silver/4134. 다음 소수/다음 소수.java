import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			long num = Long.parseLong(st.nextToken());
			
			while(true) {
				boolean b = true;
				if(num == 0 || num == 1) {
					num = 2L;
				}
				for(long k=2;k<=Math.sqrt(num);k++) {
					if(num % k == 0) {
						b = false;
						break;
					}	
				}
				
				if(b) {
					sb.append(num+"\n");
					break;
				}else
					num++;
			}

		}
		
		System.out.println(sb);
	}
}