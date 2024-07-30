import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String ,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.length() < m){
                continue;
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = new LinkedList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(Integer.compare(map.get(o1), map.get(o2)) != 0){
                    return Integer.compare(map.get(o2), map.get(o1));
                }
                if(o1.length() != o2.length()) {
                    return o2.length()-o1.length();
                }
                return o1.compareTo(o2);
            }
        });

        for(String s : list){
            sb.append(s + "\n");
        }

        System.out.println(sb);
    }
}