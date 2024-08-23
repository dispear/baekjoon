import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int minArea = 0;
        for(int i =0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                minArea = i;
            }
            list.add(arr[i]);
        }
        
        list.remove(minArea);
        if(list.isEmpty())
            list.add(-1);
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}