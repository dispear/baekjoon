import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : score){
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        int cnt = m - 1;  
        while(list.size() > cnt){
            int p = list.get(cnt);
            cnt += m;
            answer += p * m;
        }
        
        return answer;
    }
}