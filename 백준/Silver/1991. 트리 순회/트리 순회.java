import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][2];
		
		for(int i=0;i<n;i++) {
			char a = sc.next().charAt(0);
			char b = sc.next().charAt(0);
			char c = sc.next().charAt(0);
			
			arr[a-'A'][0] = b;
			arr[a-'A'][1] = c;
		}

		pre(arr,0);
		System.out.println();
		in(arr,0);
		System.out.println();
		post(arr,0);
	}

	static void pre(char[][] arr, int v) {
		//루트
		System.out.print((char)(v+'A'));
		// 왼
		if (arr[v][0] != '.') {
			pre(arr, arr[v][0] - 'A');
		}
		// 오
		if (arr[v][1] != '.') {
			pre(arr, arr[v][1] - 'A');
		}
	}
	static void in(char[][] arr, int v) {
		// 왼
		if (arr[v][0] != '.') {
			in(arr, arr[v][0] - 'A');
		}
		//루트
		System.out.print((char)(v+'A'));
		// 오
		if (arr[v][1] != '.') {
			in(arr, arr[v][1] - 'A');
		}
	}
	static void post(char[][] arr, int v) {
		// 왼
		if (arr[v][0] != '.') {
			post(arr, arr[v][0] - 'A');
		}
		// 오
		if (arr[v][1] != '.') {
			post(arr, arr[v][1] - 'A');
		}
		//루트
		System.out.print((char)(v+'A'));
	}
}