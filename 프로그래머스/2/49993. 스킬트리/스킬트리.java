import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
 
        for(String str : skill_trees){
            Queue<Character> q = new LinkedList<>();
            
            for(int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                if(skill.indexOf(c) != -1){
                    q.add(c);
                }
            }
            
            boolean b = true;
            int a = 0;
            while(!q.isEmpty()){
                char c = q.poll();
                if(skill.charAt(a) != c){
                    b = false;
                    break;
                }
                a++;
            }
            
            if(b)
                answer++;
        }
        
        return answer;
    }
}