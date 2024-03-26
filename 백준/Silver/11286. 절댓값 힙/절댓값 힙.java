import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Long> q = new PriorityQueue<>(new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				if(Math.abs(o1) > Math.abs(o2))
					return 1;
				else if(Math.abs(o1) < Math.abs(o2)) {
					return -1;
				}else {
					if(o1 > o2) {
						return 1;
					}else
						return -1;
				}
			}
		});
		
		for(int i=0;i<n;i++) {
			long a = sc.nextInt();
			if(a == 0) {
				if(q.isEmpty())
					System.out.println(0);
				else
					System.out.println(q.poll());
			}else {
				q.add(a);
			}
		}
}}