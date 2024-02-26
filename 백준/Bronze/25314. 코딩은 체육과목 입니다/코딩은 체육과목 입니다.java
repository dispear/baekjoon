import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int i =0;

		while(i<x) {
			System.out.print("long ");
			i += 4;
		}
		System.out.println("int");
	}
}