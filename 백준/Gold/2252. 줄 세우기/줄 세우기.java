import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		boolean[] visited = new boolean[n+1];
		int[] sortArr = new int[n];
		int[] numArr = new int[n+1];
		ArrayList<Integer>[] arr = new ArrayList[n+1];
		for(int i=0;i<=n;i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			arr[a].add(b);
			numArr[b]++;
		}

		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(numArr[j]==0 && visited[j] == false) {
					sortArr[i] = j;
					for(int k=0;k<arr[j].size();k++) {
						numArr[arr[j].get(k)]--;
					}
					visited[j] = true;
					break;
				}
			}
		}
		
		for(int i=0;i<sortArr.length;i++) {
			System.out.print(sortArr[i] + " ");
		}
	}
}