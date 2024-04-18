import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	static char[][] arr;
	static int size;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			arr = new char[100][100];
			int n = sc.nextInt();
			size = 0;
			
			for(int i=0;i<100;i++) {
				arr[i] = sc.next().toCharArray();
			}
			
			for(int x = 0;x<100;x++) {	// x 시작 위치
				for(int y=0;y<100;y++) {	// y 시작 위치
					for(int i = x;i<100;i++) { // 반복 횟수
						xcheck(x,y,i);
					}
					for(int j = y;j<100;j++) {
						ycheck(x,y,j);
					}
				}
			}
			
			System.out.println("#"+n+" "+ size);
		}
	}
	static void xcheck(int x,int y,int e) {
		int xsize = e - x + 1;

		if(p(arr[y],x,e))
			size = Math.max(size, xsize);
	}
	static void ycheck(int x,int y,int e) {
		int ysize = e - y + 1;
		char[] carr = new char[ysize];
		for(int i=0;i<ysize;i++) {
			carr[i] = arr[y+i][x];
		}

		if(p(carr,0,carr.length -1))
			size = Math.max(size, ysize);
	}

	static boolean p(char[] arr,int start,int end) {
		if(start>end)
			return true;
		else {
			if(arr[start] == arr[end]) {
				return p(arr,start+1,end-1);
			}else
				return false;
		}
	}	
}
