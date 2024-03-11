import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		long[] dist = new long[n + 1];

		// 거리 배열 초기화
		dist[1] = 0;
		for (int i = 2; i < n + 1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		// 엣지 리스트 생성
		Edge[] arr = new Edge[m];
		for (int i = 0; i < m; i++) {
			arr[i] = new Edge(s.nextInt(), s.nextInt(), s.nextInt());
		}
		
		// 업데이트
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<m;j++) {
				if(dist[arr[j].start] != Integer.MAX_VALUE && dist[arr[j].end] > dist[arr[j].start] + arr[j].weight)
					dist[arr[j].end] = dist[arr[j].start] + arr[j].weight;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		// 음수 사이클 체크
		if(minusCheck(arr,dist,m)) {
			sb.append(-1);
		}else {
			for(int i=2;i<n+1;i++) {
				if(dist[i] == Integer.MAX_VALUE) {
					sb.append(-1 + "\n"); // 가는	경로가 없을 때
				}else
					sb.append(dist[i]+"\n");
			}
		}
		
		System.out.println(sb);

	}
	// 음수 사이클 체크함수
	static boolean minusCheck(Edge[] arr,long[] dist,int m) {
		for(int j=0;j<m;j++) {
			if(dist[arr[j].start] != Integer.MAX_VALUE && dist[arr[j].end] > dist[arr[j].start] + arr[j].weight)
				return true;
		}
		return false;
	}

}

class Edge {
	int start;
	int end;
	int weight;

	Edge(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
}