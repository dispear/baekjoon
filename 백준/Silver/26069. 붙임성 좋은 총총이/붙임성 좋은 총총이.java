import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if(set.contains(s1)) {
                set.add(s2);
            }else if(set.contains(s2)) {
                set.add(s1);
            }
        }

        sb.append(set.size());
        System.out.println(sb);
    }
}