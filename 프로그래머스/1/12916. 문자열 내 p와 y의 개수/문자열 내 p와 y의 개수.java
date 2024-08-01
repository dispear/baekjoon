
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int isP = 0;
        int isY = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                isP++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                isY++;
            }
        }
        
        if(isP != isY)
            answer = false;

        return answer;
    }
}