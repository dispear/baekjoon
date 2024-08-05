import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] last = new int[k];
        int min = 5000;
        
        for(int i = 0;i<k;i++){
            if(i == score.length)
                break;
            min = Math.min(min,score[i]);
            last[i] = score[i];
            answer[i] = min;
        }
        
        Arrays.sort(last);
        
        for(int i=k;i<score.length;i++){
            if(score[i] > last[0]){
                last[0] = score[i];
                Arrays.sort(last);
                min = last[0];
            }
            answer[i] = min;
        }
        
        return answer;
    }
}