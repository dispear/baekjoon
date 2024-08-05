class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = arr1[i] | arr2[i];
        }
        
        for(int i=0;i<n;i++){
            answer[i] = "";
            for(int j=0;j<n;j++){
                if(arr[i]%2 == 1){
                    answer[i] = "#" + answer[i];
                }else{
                    answer[i] = " " + answer[i];
                }
                arr[i] /= 2;
            }
        }
        
        return answer;
    }
}