import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double[] arr = new double[n];
		double max = 0;
		double sum = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextDouble();
		}
		for(int i=0;i<n;i++) {
			if(max < arr[i])
				max = arr[i];
		}
		for(int i=0;i<n;i++) {
			sum += (arr[i]/max)*100;
		}
		
		System.out.println(sum/n);
	}
}