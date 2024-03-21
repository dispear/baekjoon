import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 수
		int m = sc.nextInt(); // 변경이 일어나는 횟수
		int k = sc.nextInt(); // 구간 합을 구하는 횟수
		
		// 트리 초기화
		int a = 1; // 2^k
		while(a<n) {
			a = a*2;
		}
		long[] arr = new long[a*2];

		for(int i = 0;i<n;i++) {
			arr[a+i] = sc.nextLong();
		}
		for(int i=a-1;i>0;i--) {
			arr[i] = arr[2*i]+arr[2*i+1];
		}
		
		for(int i=0;i<m+k;i++) {
			int num = sc.nextInt();
			long start = sc.nextLong();
			long end = sc.nextLong();
			// 질의값 연산
			if(num == 2) {
				start = start + a - 1;
				end = end + a -1;
				long sum = 0;
				while(start<end) {
					if(start%2 == 1)
						sum += arr[(int) start];
					if(end%2==0)
						sum += arr[(int) end];
					start = (start+1)/2;
					end = (end-1)/2;
				}
				if(start==end)
					sum += arr[(int) start];
				System.out.println(sum);
			}
			// 데이터 업데이트
			else if (num == 1) {
				long tmp=0;
				start = start + a - 1;
				tmp = arr[(int) start];
				arr[(int) start] = end;
				
				while(start/2>0) {
					start /= 2;
					arr[(int) start] = arr[(int) start] + end - tmp;
				}
			}
		}
	}
}