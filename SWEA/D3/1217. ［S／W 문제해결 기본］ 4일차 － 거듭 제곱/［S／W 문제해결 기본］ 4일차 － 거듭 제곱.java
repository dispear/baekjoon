
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int result = b;
			
			for(int i=1;i<c;i++) {
				result *= b;
			}
			
			System.out.println("#"+a+" "+result);
		}
	}
}