class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0;
        int y = 0;
        int size = (brown+4)/2;
        int[] answer = new int[2];
        for(int i = size -1;i>=size/2;i--){
            x = i;
            y = size - i;
            if(x*y == brown+yellow){
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }
        return answer;
    }
}