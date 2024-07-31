import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());

        sb.append(pac(n));
        System.out.println(sb);
    }

    static long pac(long x){
        if(x == 0)
            return 1;

        return x * pac(x-1);
    }

}