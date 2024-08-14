class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dow = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] dayArr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int day = 0;
        
        for(int i= 0;i<a;i++){
            day += dayArr[i];
        }
        
        day += b;
        day %= 7;
        
        answer = dow[day];
        
        return answer;
    }
}