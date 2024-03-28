import java.util.*;

public class Main {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			sort(n,sc.nextInt());
		}
		
	}
	static void sort(int n,int value) {
		int start = 0;
		int end = n-1;
		int mid = 0;
		
		while(end - start >= 0) {
			mid = (start+end) /2;
			if(arr[mid] == value) {
				System.out.println(1);
				return;
			}else if(arr[mid] > value) {
				end = mid-1;
			}else
				start = mid+1;
		}
		
		System.out.println(0);
	}
}