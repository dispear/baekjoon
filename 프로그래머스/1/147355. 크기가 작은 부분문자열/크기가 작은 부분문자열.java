import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        int n = t.length() - p.length() + 1;
        long m = Long.parseLong(p);
        
        for(int i = 0;i<n;i++){
            list.add(t.substring(i,i+p.length()));
        }
        for(int i = 0;i<list.size();i++){
            long a = Long.parseLong(list.get(i));
            if(a <= m)
                answer++;
                
        }
        
        return answer;
    }
}