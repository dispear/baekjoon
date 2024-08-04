class Solution {
    public int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;
        
        String numstr = "";
        String nextstr = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9' ){
                numstr += s.charAt(i);
            }else{
                nextstr += s.charAt(i); 
                
                for(int j=0;j< 10;j++){
                    if(nextstr.contains(str[j])){
                         numstr += Integer.toString(j);
                         
                         nextstr = "";
                         break;
                    }
                }
            }
        }
        
        answer = Integer.parseInt(numstr);
        return answer;
    }
}