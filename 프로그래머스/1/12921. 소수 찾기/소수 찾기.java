class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!arr[i]){
                int a = 2 * i;
                while(a <= n){
                    arr[a] = true;
                    a += i;
                }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(!arr[i])
                answer++;
        }
        
        return answer;
    }
}