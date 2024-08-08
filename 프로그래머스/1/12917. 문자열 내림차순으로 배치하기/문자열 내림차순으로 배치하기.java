import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> carr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            carr.add(s.charAt(i));
        }
        
        Collections.sort(carr, Collections.reverseOrder());
        
        for(int i=0;i<carr.size();i++){
            answer += carr.get(i);
        }
        return answer;
    }
}