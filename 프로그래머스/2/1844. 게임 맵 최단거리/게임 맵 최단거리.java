import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<Pos> q = new LinkedList<>();
        int[][] value = new int[n][m];
        
        q.add(new Pos(0,0));
        value[0][0] = 1;
        
        while(!q.isEmpty()){
            Pos p = q.poll();
            int x = p.x;
            int y = p.y;
            
            for(int i = 0;i< 4;i++){
                int checkX = x - dx[i];
                int checkY = y - dy[i];
                if(checkX >= 0 && checkX < m && checkY >= 0 && checkY < n){
                    if(maps[checkY][checkX] == 1){
                        q.offer(new Pos(checkY,checkX));
                        maps[checkY][checkX] = 0;
                        
                        if(value[checkY][checkX] != 0){
                            value[checkY][checkX] = Math.min(
                                value[checkY][checkX], value[y][x] + 1);
                        }else{
                            value[checkY][checkX] = value[y][x] + 1;
                        }
                    
                    }
                }
            }
        }
        
        if(value[n-1][m-1] != 0)
            return value[n-1][m-1];
        else
            return -1;
    }
    
    public class Pos{
        int y;
        int x;
        
        Pos(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}