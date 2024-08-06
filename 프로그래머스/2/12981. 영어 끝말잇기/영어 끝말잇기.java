import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> hs = new HashSet<>();
        
        String str = words[0];
        hs.add(str);
        for(int i=1;i<words.length;i++){
            if(str.charAt(str.length() - 1) != words[i].charAt(0) || hs.contains(words[i])){
                if((i+1) % n == 0){
                    answer[0] = n;
                    answer[1] = (i+1) / n;
                }else{
                    answer[0] = (i+1) % n;
                    answer[1] = ((i+1) / n) + 1;
                }
                     
                break;
            }else{
                str = words[i];
                hs.add(str);
            }
        }

        return answer;
    }
}