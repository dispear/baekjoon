import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long n = Integer.parseInt(st.nextToken());

		System.out.println(n *(n-1) * (n-2) /6);
		System.out.println(3);
	}
}