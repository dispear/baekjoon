class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int tmp = n % a;
            int rec = (n / a) * b;
            n = rec + tmp;
            answer += rec;
        }
        return answer;
    }
}