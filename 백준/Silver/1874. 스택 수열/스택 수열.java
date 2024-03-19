import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		int a = sc.nextInt();
		int cnt = n; // 올바른지 체크
		
		for(int i=1;i<=n;i++) { // 오름차순
			arr.add(i);
			sb.append('+'+"\n");
			
			while(arr.size() != 0 && arr.get(arr.size() -1) == a) {
				arr.remove(arr.size()-1);
				cnt--;
				sb.append('-'+"\n");
				if(cnt > 0) 
					a = sc.nextInt();
			}
		}
		
		if(cnt != 0) {
			System.out.println("NO");
		}else {
			System.out.println(sb);
		}
	}	
}