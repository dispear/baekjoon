class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = '\0';
        int first = 0;
        int same = 0;
        
        for(int i=0;i<s.length();i++){
            if(c == '\0'){
                c = s.charAt(i);
                first++;
            }else{
                if(c == s.charAt(i)){
                    first++;
                }else{
                    same++;
                }
                
                if(first == same){
                    answer++;
                    first = 0;
                    same = 0;
                    c = '\0';
                }
            }
        }
        
        if(first > 0)
            answer++;
        
        return answer;
    }
}