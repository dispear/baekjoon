import java.util.*;

public class Main{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.nextInt()));
    }
    public static String solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        int a = 0;

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            arr[a++] = queue.poll();
        }

        String str = "<";
        for (int i = 0; i < n - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[n - 1] + ">";
        return str;
    }
}