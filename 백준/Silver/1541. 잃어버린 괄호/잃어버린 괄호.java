import java.util.*;

public class Main {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String arr[] = n.split("-");
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			int b = 0;
			if(arr[i].contains("+")) {
				String str[] = arr[i].split("\\+");
				if(i == 0) {
					for(int j=0;j<str.length;j++) {
						b += Integer.parseInt(str[j]);
					}
				}else {
					for(int j=0;j<str.length;j++) {
						b -= Integer.parseInt(str[j]);
					}
				}
			}else {
				if(i==0) {
					b +=Integer.parseInt(arr[i]);
				}else
					b -=Integer.parseInt(arr[i]);
			}
				
			a += b;	
		}
		System.out.println(a);
	}
}