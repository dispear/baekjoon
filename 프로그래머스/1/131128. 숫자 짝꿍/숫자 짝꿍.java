import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for(int i=0;i<X.length();i++){
            char c = X.charAt(i);
            arr1[c-'0']++;
        }
        for(int i=0;i<Y.length();i++){
            char c = Y.charAt(i);
            arr2[c-'0']++;
        }
        for(int i=9;i>=0;i--){
            if(arr1[i] != 0 && arr2[i] != 0){
                int n = Math.min(arr1[i], arr2[i]);
                for(int j=0;j<n;j++)
                    sb.append(i);
            }
        }
        
        answer = sb.toString();        
        if(answer.equals(""))
            return "-1";
        else if(answer.charAt(0) == '0')
            return "0";
        else
            return answer;
    }
}