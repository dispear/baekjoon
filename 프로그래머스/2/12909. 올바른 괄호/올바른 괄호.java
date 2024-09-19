import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack st = new Stack();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.add('(');
            }else{
                if(st.isEmpty()){
                    return false;
                }
                
                st.pop();
            }
        }
        
        if(!st.isEmpty())
            answer = false;

        return answer;
    }
}