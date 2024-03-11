import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int king = s.nextInt();
		int queen = s.nextInt();
		int look = s.nextInt();
		int bishop = s.nextInt();
		int knite = s.nextInt();
		int pon = s.nextInt();
		
		System.out.print(1 - king + " ");
		System.out.print(1 - queen + " ");
		System.out.print(2 - look + " ");
		System.out.print(2 - bishop + " ");
		System.out.print(2 - knite + " ");
		System.out.print(8 - pon + " ");
	}
}