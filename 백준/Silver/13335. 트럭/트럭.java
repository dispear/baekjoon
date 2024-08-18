import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        int time = 0;

        for (int i = 0; i < w; i++) {
            queue.offer(0);
        }

        st = new StringTokenizer(br.readLine());
        int truck = Integer.parseInt(st.nextToken());
        while (true) {
            time++;

            num -= queue.poll();

            if (num + truck <= l) {
                queue.add(truck);
                num += truck;
                n--;
                if (n == 0)
                    break;

                truck = Integer.parseInt(st.nextToken());

            } else {
                queue.add(0);
            }

        }

        time += queue.size();
        sb.append(time);
        System.out.println(time);
    }
}