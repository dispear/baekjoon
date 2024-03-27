import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(aaa(n,m));
	}
	static int aaa(int n,int m) {
		if(m == 0 || n==m)
			return 1;
		else if(m==1)
			return n;
		else
			return aaa(n-1,m-1)+aaa(n-1,m);
	}
}