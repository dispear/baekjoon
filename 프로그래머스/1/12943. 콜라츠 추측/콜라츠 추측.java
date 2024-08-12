class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        
        while(cnt < 500 && num != 1){
            cnt++;
            num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
        }
        if(cnt == 500)
            cnt = -1;
        answer = cnt;
        return answer;
    }
}