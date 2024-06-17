import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		
		ArrayList<NODE>[] arr = new ArrayList[v+1];
		for(int i=1;i<=v;i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i=0;i<e;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			arr[a].add(new NODE(b, c));
		}

		boolean[] visited = new boolean[v+1];
		int[] dist = new int[v+1];
		for(int i=1;i<=v;i++) {
			if(i == start)
				dist[i] = 0;
			else
				dist[i] = Integer.MAX_VALUE;
		}
		
		PriorityQueue<NODE> que = new PriorityQueue<>((o1,o2)-> o1.w-o2.w);
		que.offer(new NODE(start, 0));
		dist[start] = 0;
		while(!que.isEmpty()) {
			NODE n = que.poll();
			
			if(dist[n.v]< n.w)
				continue;
			
			for(int i=0;i<arr[n.v].size();i++) {
				NODE newNode = arr[n.v].get(i);
				
				if(dist[newNode.v] > n.w + newNode.w) {
					dist[newNode.v] = n.w + newNode.w;
					que.offer(new NODE(newNode.v,dist[newNode.v]));
				}
			}
		}
		
		for(int i=1;i<=v;i++) {
			if(dist[i] == Integer.MAX_VALUE)
				sb.append("INF\n");
			else
				sb.append(dist[i]+"\n");
		}
		
		System.out.println(sb);
	}
}
class NODE {
	int v;
	int w;
	public NODE(int v,int w) {
		this.v = v;
		this.w = w;
	}
}