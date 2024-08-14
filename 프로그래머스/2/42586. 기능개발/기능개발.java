import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] dayArr = new int[progresses.length];
        int day = 1;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            dayArr[i] = day;
            day = 1;
        }

        for(int i = 0; i < dayArr.length; i++) {
            q.offer(dayArr[i]);
        }

        while(!q.isEmpty()) {
            int index = q.poll();
            int num = 1;
            while(!q.isEmpty() && index >= q.peek()) {
                q.poll();
                num++;
            }
            
            arr.add(num);
        }

        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}