class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        for(int i=1;i<food.length;i++){
            for(int j=1;j <= food[i] / 2; j++){
                str += Integer.toString(i);
            }
        }
        
        answer += str;
        answer += "0";
        
        for(int i = str.length() -1 ; i>=0 ;i--){
            answer += str.charAt(i);
        }
        
        return answer;
    }
}