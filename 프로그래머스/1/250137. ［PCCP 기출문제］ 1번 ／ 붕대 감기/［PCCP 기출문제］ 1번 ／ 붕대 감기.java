class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int nowHealth = health;
        int cntHealth = 0;
        int time = attacks[attacks.length -1][0];
        int cntAttacks = 0;
        
        for(int i=1;i<=time;i++){
            if(i == attacks[cntAttacks][0] ){
                nowHealth -= attacks[cntAttacks][1];
                cntHealth = 0;
                cntAttacks++;
                if(nowHealth <= 0)
                    break;
            }else {
                nowHealth += bandage[1];
                cntHealth++;
                if(cntHealth == bandage[0]){
                    nowHealth += bandage[2];
                    cntHealth = 0;
                }
                if(nowHealth >= health)
                    nowHealth = health;
            }
        }
        
        if(nowHealth <= 0)
            answer = -1;
        else
            answer = nowHealth;
        
        return answer;
    }
}