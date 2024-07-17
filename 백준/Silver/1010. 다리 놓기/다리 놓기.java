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
		int[][] arr = new int[30][30];
		
		for(int i=0;i<30;i++) {
			arr[i][0] = 1;
			arr[i][1] = i;
			arr[i][i] = 1;
		}
		
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a > b) {
				sb.append(arr[a][b] + "\n");
			}else
				sb.append(arr[b][a] + "\n");
			
		}

		System.out.println(sb);
	}
}