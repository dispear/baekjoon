import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
		}

		int min = 64;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int b = 0;
				int w = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if ((k + l) % 2 == 0) {
							if (str[k].charAt(l) == 'B')
								w++;
							else
								b++;
						} else { 
							if (str[k].charAt(l) == 'B')
								b++;
							else
								w++;
						}
					}
				}
				if (min > b)
					min = b;
				if (min > w)
					min = w;
			}
		}

		System.out.println(min);

	}
}