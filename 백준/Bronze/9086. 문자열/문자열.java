import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0;i<n;i++) {
			String str = s.next();
			
			System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
		}
		
	}
}