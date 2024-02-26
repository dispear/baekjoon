import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = i+1;
		}
		
		for(int i=0;i<m;i++) {
			int start = s.nextInt() - 1;
			int end = s.nextInt() - 1;
			
			while(start<end) {
				int tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
				start++;
				end--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}