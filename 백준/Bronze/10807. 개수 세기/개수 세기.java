import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int[] arr = new int[x];
		int cnt = 0;
		
		for(int i=0;i<x;i++) {
			arr[i] = s.nextInt();
		}
		int n = s.nextInt();
		
		for(int i=0;i<x;i++) {
			if(arr[i] == n)
				cnt++;
		}
		System.out.println(cnt);
	}
}