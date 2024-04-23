import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] d = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			d[i] = 1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i] > arr[j])
					d[i] = Math.max(d[i], d[j]+1);
			}
		}
		
		int max= 0;
		for(int i=0;i<n;i++) {
			max = Math.max(max, d[i]);
		}
	
		System.out.println(max);
	}
}
