import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
            
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i) == st.peek())
                st.pop();
            else
                st.push(s.charAt(i));
        }

        if(!st.isEmpty())
            answer = 0;
        
        return answer;
    }
}