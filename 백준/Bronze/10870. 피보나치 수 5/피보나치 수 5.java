import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        sb.append(pibo(n));
        System.out.println(sb);
    }

    static int pibo(int x) {
        if (x == 0)
            return 0;
        else if (x == 1)
            return 1;
        else
            return pibo(x - 1) + pibo(x - 2);
    }

}