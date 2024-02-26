import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int sum =0;
		
		if(a == b && a==c && b==c) 
			sum = 10000+(a*1000);
		else if(a==b)
			sum = 1000 +(a*100);
		else if(a==c)
			sum = 1000 +(a*100);
		else if(b==c)
			sum = 1000 +(b*100);
		else 
			sum = Math.max(Math.max(a, b), c) * 100;
		
		System.out.println(sum);
	}
}