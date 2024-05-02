import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{
	static int n, a;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
			a = (int) Math.pow(2, n);
			int[] arr =new int[a];
					
			for(int i=1;i<a;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.print("#"+test_case+" ");
			tree(arr,1,a/2);	
		}
	}
	static void tree(int[] arr,int level,int x) {
		if(level > n)
			return;
		else {	
			for(int i=x;i<a;i=i+(2*x)) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			tree(arr,level+1,x/2);
		}
	}
}
