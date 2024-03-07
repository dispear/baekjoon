import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		int[] srr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i == 0) {
				srr[i] = arr[i];
			}
			else {
				srr[i] = srr[i-1] + arr[i];
			}
		}
		
		for(int i=0;i<m;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if(a==1) {
				System.out.println(srr[b-1]);
			}else
				System.out.println(srr[b-1] - srr[a-2]);
		}
	}
}