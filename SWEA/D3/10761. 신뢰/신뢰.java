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
			ArrayList<Character> arr = new ArrayList<>();
			ArrayList<Integer> blue = new ArrayList<>();
			ArrayList<Integer> orange = new ArrayList<>();
			
			for(int i=0;i<n;i++) {
				char a = sc.next().charAt(0);
				arr.add(a);
				if(a == 'B')
					blue.add(sc.nextInt());
				else
					orange.add(sc.nextInt());
			}
			
			int cnt = 0;
			int b = 1;
			int o = 1;
			int moveb = 0;
			int moveo = 0;
			
			for(int i=0;i<arr.size();i++) {
				char c = arr.get(i);
				
				while(true) {
					cnt++;
					if(!blue.isEmpty()) {
						if(b < blue.get(0)) {
							moveb = b+1;
						}else if(b > blue.get(0)) {
							moveb = b -1;
						}else {
							moveb = b;
						}	
					}
					if(!orange.isEmpty()) {
						if(o < orange.get(0)) {
							moveo = o+1;
						}else if(o > orange.get(0)) {
							moveo = o -1;
						}else {
							moveo = o;
						}	
					}
					
					if(c == 'B') {
						if(b == moveb) {
							blue.remove(0);
							o = moveo;
							break;
						}
					}else {
						if(o == moveo) {
							orange.remove(0);;
							b = moveb;
							break;
						}
					}
					
					b = moveb;
					o = moveo;
				}
			}
					
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
