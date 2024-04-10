import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double sum = 0;
		double scoreSum = 0;
		
		for(int i=0;i<20;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			scoreSum += score;
			
			switch (st.nextToken()) {
			case "A+":
				score *= 4.5;
				sum += score;
				break;
			case "A0":
				score *= 4.0;
				sum += score;
				break;
			case "B+":
				score *= 3.5;
				sum += score;
				break;
			case "B0":
				score *= 3.0;
				sum += score;
				break;
			case "C+":
				score *= 2.5;
				sum += score;
				break;
			case "C0":
				score *= 2.0;
				sum += score;
				break;
			case "D+":
				score *= 1.5;
				sum += score;
				break;
			case "D0":
				score *= 1.0;
				sum += score;
				break;
			case "F":
				score *= 0;
				sum += score;
				break;
			default:
				scoreSum -= score;
				break;
			}
		}
		
		sb.append(sum/scoreSum);
		System.out.println(sb);
	}
}