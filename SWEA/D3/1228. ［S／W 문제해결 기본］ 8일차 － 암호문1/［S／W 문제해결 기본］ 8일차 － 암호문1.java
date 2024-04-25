import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
//		int T;
//		T=sc.nextInt();

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				arr.add(sc.nextInt()); 
			}
			
			n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				for(int j=0;j<y;j++) {
					arr.add(x+j,sc.nextInt());
				}
			}
			
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<10;i++) {
				sb.append(arr.get(i)+" ");
			}
			
			System.out.println("#"+test_case+" "+sb);
		}
	}
}