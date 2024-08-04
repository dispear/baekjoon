import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        long answer = 0;
        long[] arr = new long[str.length()];
        
        for(int i=0;i<str.length();i++){
            arr[i] = n % 10;
            n = n / 10;
        }
        Arrays.sort(arr);
        
        str = "";
        for(int i = arr.length - 1;i >= 0 ;i--){
            str += Long.toString(arr[i]);
        }
        answer = Long.parseLong(str);
        
        return answer;
    }
}