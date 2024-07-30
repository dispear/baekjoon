import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer ,Integer> map = new HashMap<>();
        int[] arr = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new LinkedList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) == map.get(o2)){
                    return o1-o2;
                }
                return map.get(o2) - map.get(o1);
            }
        });



        sb.append(Math.round((double)sum/n) + "\n");
        sb.append(arr[n/2] + "\n");

        if (list.size() == 1) {
            sb.append(list.get(0) + "\n");
        }else{
            if(map.get(list.get(0)) == map.get(list.get(1))){
                sb.append(list.get(1) + "\n");
            }else{
                sb.append(list.get(0) + "\n");
            }
        }

        sb.append(Math.abs(arr[n-1] - arr[0]));

        System.out.println(sb);
    }
}