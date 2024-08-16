class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cntZero = 0;
        int cnt = 0;
        int[] grade = {6,6,5,4,3,2,1};
        
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                cntZero++;
                continue;
            }
            
            for(int j=0;j<6;j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
        }
        
        answer[0] = grade[cnt+cntZero];
        answer[1] = grade[cnt];

        return answer;
    }
}