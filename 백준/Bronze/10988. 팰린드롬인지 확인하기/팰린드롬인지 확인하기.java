import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int start = 0;
		int end = str.length() -1;
		
		a(str,start,end);
	}
	static void a(String str, int start, int end) {
		if(start>=end) {
			System.out.println(1);
		}else {
			if(str.charAt(start) == str.charAt(end)) {
				a(str,start+1,end-1);
			}else {
				System.out.println(0);
			}
		}
	}
}