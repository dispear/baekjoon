class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] position = {{3,1,0,1,2,1,2,3,2,3,4,4},
                            {2,2,1,2,1,0,1,2,1,2,3,3},
                            {1,3,2,3,2,1,2,1,0,1,2,2},
                            {0,4,3,4,3,2,3,2,1,2,1,1}};
        int left = 10;
        int right = 11;
        
        for(int i = 0;i < numbers.length;i++){
            int pos = numbers[i];
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ) {
                answer += 'L';
                left = pos;
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += 'R';
                right = pos;
            }else{
                int leftside = 0;
                int rightside = 0;
                System.out.println(left + " " + right + " " + pos);
                switch (pos){
                    case 2:
                        leftside = position[0][left];
                        rightside = position[0][right];
                        break;
                    case 5:
                        leftside = position[1][left];
                        rightside = position[1][right];
                        break;
                    case 8:
                        leftside = position[2][left];
                        rightside = position[2][right];
                        break;
                    case 0:
                        leftside = position[3][left];
                        rightside = position[3][right];
                        break;
                }
                    
                if(leftside > rightside){
                    answer += 'R';
                    right = pos;
                }else if(leftside < rightside){
                    answer += 'L';
                    left = pos;
                }else{
                    if(hand.equals("right")){
                        answer += 'R';
                        right = pos;
                    }else if(hand.equals("left")){
                        answer += 'L';
                        left = pos;
                    }
                }
            }
        }
        
        return answer;
    }
}