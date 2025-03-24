class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if(flag){
                if(s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'z' <= 0){
                    c = Character.toUpperCase(c);
                }
                answer += c;
            }else{
                if(s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'Z' <= 0){
                    c = Character.toLowerCase(c);
                }
                answer += c;
            }

            if(c == ' '){
                flag = true;
            }else{
                flag = false;
            }
        }
        
        return answer;
    }
}