class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            String str = babbling[i];
            str = str.replace("aya","1").replace("ye","2").
                replace("woo","3").replace("ma","4");
            
            char c = '\0';
            boolean b = true;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) >= 'a' && str.charAt(j) <= 'z'){
                    b = false;
                    break;
                }
                if(c == str.charAt(j)){
                    b = false;
                    break;
                }
                
                c = str.charAt(j);
            }
            
            if(b)
                answer++;
        }
        return answer;
    }
}