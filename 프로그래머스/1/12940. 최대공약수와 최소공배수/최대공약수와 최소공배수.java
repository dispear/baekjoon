class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m){
            answer[0] = gcd(n,m);
        }else
            answer[0] = gcd(m,n);
        
        answer[1] = m * n / answer[0];
        
        return answer;
    }
    
    public int gcd(int n, int m){
        if(m == 0)
            return n;
        else
            return gcd(m, n%m);
    }
}