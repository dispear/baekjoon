import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Solution
{	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			ArrayList<Long> arr= new ArrayList<>();
			
			for(int i=0;i<n*2;i++) {
				arr.add(sc.nextLong());
			}
						
			System.out.print("#"+test_case+" ");

			for(int i=0;i<n;i++) {
				long a = arr.get(i);
				a = 4*a /3;
				for(int j=i+1;j<2*n;j++) {
					if(arr.get(j) == a) {
						arr.remove(j);
						break;
					}	
				}
				System.out.print(arr.get(i)+" ");
			}
			
			System.out.println();
		}
	}
}
