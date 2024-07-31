import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            count = 1;
            int result = check(s, 0, s.length() - 1, count);
            sb.append(result + " " + count + "\n");
        }

        System.out.println(sb);
    }

    static int check(String s, int l, int r, int cnt) {
        if (l >= r)
            return 1;
        else if (s.charAt(l) != s.charAt(r))
            return 0;
        else {
            count++;
            return check(s, l + 1, r - 1, count);
        }
    }

}