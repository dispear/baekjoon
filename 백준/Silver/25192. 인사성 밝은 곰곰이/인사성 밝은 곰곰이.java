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
        int count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("ENTER")){
                set = new HashSet<>();
            }else {
                if (!set.contains(s)){
                    set.add(s);
                    count++;
                }
            }
        }

        sb.append(count);
        System.out.println(sb);


    }
}