import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour = s.nextInt();
		int minute = s.nextInt();
		int time = s.nextInt();
		
		minute += time;
		if(minute >= 60) {
			hour = hour + minute/60;
			minute %= 60;
		}
		if(hour >=24)
			hour %= 24;
		
		System.out.println(hour + " " + minute);
	}
}