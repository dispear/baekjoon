import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		long[][] arr = new long[n+1][n+1];
		
		// 인접행렬 초기화
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(i == j)
					arr[i][j] = 0;
				else
					arr[i][j] = 10000001;
			}
		}
		
		// 리스트 가중치 저장
		for(int i=0;i<m;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			arr[a][b] = Math.min(arr[a][b], c);
		}
		
		// 플로이드 워셜
		for(int k=1;k<n+1;k++) {
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<n+1;j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k]+arr[k][j]);
				}
			}
		}
		
		// 출력
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(arr[i][j] == 10000001)
					System.out.print(0 + " ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}