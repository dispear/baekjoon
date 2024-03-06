import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int[] arr = new int[25];
		
		int sum = 0;
		int index = 0;
		int x = 0; // 숫자 파싱 기준점
		char lastChar = '+';
		
		for(int i=0;i<n.length();i++) {
			char c = n.charAt(i);
			if(c == '+') {
				// 지금까지의 값을 더함
				sum = sum + Integer.parseInt(n.substring(x,i));
				x = i+1;
				lastChar = c;
			}else if(c == '-') {
				// 지금까지의 값을 더하고 초기화
				// arr에 더한 값을 추가
				sum = sum + Integer.parseInt(n.substring(x,i));
				x = i+1;
				arr[index++] = sum;
				sum = 0;
				lastChar = c;
			}
		}
		// 마지막 연산자가 +면 arr[index]에 마지막 숫자와 sum을  더하고 sum을 추가
		// 마지막 연산자가 -면 arr[index]에 마지막 숫자를 추가
		if(lastChar == '+')
			arr[index] = sum + Integer.parseInt(n.substring(x));
		else if(lastChar == '-')
			arr[index] = Integer.parseInt(n.substring(x));
		
		int result = arr[0];
		for(int i=1;i<=index;i++)
			result -= arr[i];
		System.out.println(result);	
	}
}