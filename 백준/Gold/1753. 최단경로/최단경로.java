import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int start = s.nextInt();
		boolean[] visited = new boolean[v + 1];
		int[] dist = new int[v + 1];

		for (int i = 1; i <= v; i++) {
			if (i == start)
				dist[i] = 0;
			else
				dist[i] = Integer.MAX_VALUE;
		}

		ArrayList<Node>[] arr = new ArrayList[v + 1];
		for (int i = 1; i <= v; i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i=0;i<e;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int value = s.nextInt();
			
			arr[a].add(new Node(b,value));
		}
		
		// 다익스트라
		PriorityQueue<Node> que = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);
		que.offer(new Node(start,0));
		visited[start] = true;
		
		while(!que.isEmpty()) {
			Node n = que.poll();
			visited[n.next] = true;
			// n노드의 인접리스트 만큼 리스트
			for(Node x : arr[n.next]) {
				if(dist[x.next] > dist[n.next] + x.value) {
					dist[x.next] = dist[n.next] + x.value;
					que.offer(new Node(x.next, dist[x.next]));
				}
			}
		}
		
		for(int i=1;i<=v;i++) {
			if(dist[i] == Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(dist[i]);
		}
	}

}

class Node {
	public int next;
	public int value;

	Node(int next, int value) {
		this.next = next;
		this.value = value;
	}
}