import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0 && c == 0)
				break;
			
			if(a < b + c && b < a + c && c < a+b) {
				if (a == b && b == c && a == c)
					System.out.println("Equilateral");
				else if (a != b && b != c & a != c)
					System.out.println("Scalene");
				else
					System.out.println("Isosceles");
			}else {
				System.out.println("Invalid");
			}

		}

	}
}