import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			result = q.poll();
			if(q.isEmpty()) {
				break;
			}
			result = q.poll();
			q.add(result);
		}
		
		System.out.println(result);
	}
}