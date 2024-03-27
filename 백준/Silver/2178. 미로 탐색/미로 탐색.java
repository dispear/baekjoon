import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] visited = new boolean[n+1][m+1];
		int[][] arr = new int[n+1][m+1];
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};

		for(int i=1;i<=n;i++) {
			String str = sc.next();
			for(int j=0;j<m;j++) {
				arr[i][j+1] = str.charAt(j) - '0';
			}
		}
		
		Queue<node> q = new LinkedList<>();
		q.add(new node(1,1));
		visited[1][1] = true;
		while(!q.isEmpty()) {
			node d = q.poll();
			for(int i=0;i<4;i++) {
				if((d.x+dy[i] > 0 && d.x+dy[i] <= n) && (d.y+dx[i] >0 && d.y+dx[i]<= m) && arr[d.x+dy[i]][d.y+dx[i]] != 0  ) {
					if(!visited[d.x+dy[i]][d.y+dx[i]]) {
						visited[d.x+dy[i]][d.y+dx[i]] = true;
						arr[d.x+dy[i]][d.y+dx[i]] = arr[d.x][d.y] +1;
						q.add(new node(d.x+dy[i],d.y+dx[i]));
					}
				}
			}
		}
		
		System.out.println(arr[n][m]);
	}
}

class node{
	int x=0;
	int y=0;
	
	node(int x,int y){
		this.x = x;
		this.y = y;
	}
}