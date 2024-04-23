import java.util.*;
import java.io.*;
 
class Solution {
     
    static int[][] arr;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,-1,-1,-1,0,1,1,1};
     
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
 
        for (int test_case = 1; test_case <= T; test_case++) {
             
            int n = sc.nextInt(); //보드 크기
            int m = sc.nextInt();   //돌놓는 횟수
             
            arr = new int[n][n];
             
            arr[n/2][n/2] = 2;
            arr[n/2-1][n/2-1] = 2;
            arr[n/2-1][n/2] = 1;
            arr[n/2][n/2-1] = 1;
             
             
            for(int i=0;i<m;i++) {
                int y = sc.nextInt()-1;
                int x = sc.nextInt()-1;
                int color = sc.nextInt(); //1 흑돌, 2백돌
                arr[y][x] = color;
                changeDoll(y,x,color,n);
            }
             
            //System.out.println("#" + test_case + " " );
            System.out.print("#" + test_case + " " );
            int cnt1 = 0;
            int cnt2 = 0;
             
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(arr[i][j]==1)cnt1++;
                    else if(arr[i][j]==2)cnt2++;
                }
            }
            System.out.println(cnt1+" "+cnt2);
        }
 
    }
    static void changeDoll(int y, int x, int color, int n) {
         
        for(int i=0;i<8;i++) {
            int hy = y+dy[i];
            int hx = x+dx[i];
             
            //8방향으로 이동
            //0이나 끝을 만나면 다음 방향으로
            //color와 같은 색을 만나면 그 중간 전부 color로 바꾸고 다음 방향
            while(hy>=0&&hy<n&&hx>=0&&hx<n) {
                 
                if(arr[hy][hx] == 0) {
                    break;
                }else if(arr[hy][hx] == color) {
                    //중간 칼라 모두 변경
                    int cy = y+dy[i];
                    int cx = x+dx[i];
                     
                    while(true) {
                        arr[cy][cx] = color;
                        if(cy==hy && cx == hx) break;
                         
                        cy+=dy[i];
                        cx+=dx[i];
                    }
                     
                    break;
                }else {
                    hy +=dy[i];
                    hx +=dx[i];
                }
            }
        }
    }
}