import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < n-1; i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j] == m)
					count++;
			}
		}
		
		System.out.println(count);
	}
}