class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] str = s.split(" ");
        
        for(int i=0;i<str.length;i++){
            int n = Integer.parseInt(str[i]);
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        
        return min + " " + max;
    }
}