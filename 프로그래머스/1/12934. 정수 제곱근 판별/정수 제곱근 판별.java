class Solution {
    public long solution(long n) {
        long answer = 0;
        long sq = (long)Math.sqrt(n);
        
        if(Math.pow(sq,2) == n){
            answer =(long)Math.pow(sq+1,2);
        }else
            answer = -1;
        
        
        return answer;
    }
}