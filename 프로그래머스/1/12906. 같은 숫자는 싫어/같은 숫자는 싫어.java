import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Queue<Integer> q = new LinkedList<>();
        q.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1])
                q.add(arr[i]);
        }
        
        int[] answer = new int[q.size()];
        int num = 0;
        while(!q.isEmpty()){
            int a = q.poll();
            answer[num] = a;
            num++;
        }
        
        return answer;
    }
}