class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        int num = 1;
        
        while(n > 0){
            str += n % 3;
            n /= 3;
        }
        
        for(int i=str.length() -1 ;i >=0;i--){
            answer += (str.charAt(i) - '0') * num;
            num *= 3;
        }
        
        return answer;
    }
}