import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		
		for(int a=0;a<m;a++) {
			int i = s.nextInt();
			int j = s.nextInt();
			int k = s.nextInt();
			
			for(int b=i-1;b<j;b++) {
				arr[b] = k;
			}
		}
		for(int a=0;a<n;a++) {
			System.out.print(arr[a] + " ");
		}
	}
}