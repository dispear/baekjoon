import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        while(sum + d[answer] <= budget){
            sum += d[answer];
            answer++;
            
            if(answer == d.length)
                break;
        }
        
        return answer;
    }
}