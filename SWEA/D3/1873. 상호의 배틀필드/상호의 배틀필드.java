import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			char[][] arr = new char[h][w];
			int x = 0;
			int y = 0;
			char state = '0';
			
			for(int i=0;i<h;i++) {
				String s = sc.next();
				for(int j=0;j<w;j++) {
					arr[i][j] = s.charAt(j);
					if(arr[i][j] == '^') {
						x = j;
						y = i;
						state = 'u';
					}else if(arr[i][j] == 'v') {
						x = j;
						y = i;
						state = 'd';
					}else if(arr[i][j] == '<') {
						x = j;
						y = i;
						state = 'l';
					}else if(arr[i][j] == '>') {
						x = j;
						y = i;
						state = 'r';
					}
				}
			}
			
			int n = sc.nextInt();
			String str = sc.next();
			XY car = new XY(x,y,state);
			for(int i=0;i<n;i++) {
				x = car.x;
				y = car.y;
				if(str.charAt(i) == 'S') {
					if (car.state == 'u') {
						while(true) {
							if(y-1>=0) {
								if(arr[y-1][x] == '*') {
									arr[y-1][x] = '.';
									break;
								}
								else if(arr[y-1][x] == '#')
									break;
								else
									y--;
							}else
								break;
						}
					}
					if (car.state == 'd') {
						while(true) {
							if(y+1<h) {
								if(arr[y+1][x] == '*') {
									arr[y+1][x] = '.';
									break;
								}
								else if(arr[y+1][x] == '#')
									break;
								else
									y++;
							}else
								break;
						}
					}
					if (car.state == 'l') {
						while(true) {
							if(x-1>=0) {
								if(arr[y][x-1] == '*') {
									arr[y][x-1] = '.';
									break;
								}
								else if(arr[y][x-1] == '#')
									break;
								else
									x--;
							}else
								break;
						}
					}
					if (car.state == 'r') {
						while(true) {
							if(x+1<w) {
								if(arr[y][x+1] == '*') {
									arr[y][x+1] = '.';
									break;
								}
								else if(arr[y][x+1] == '#')
									break;
								else
									x++;
							}else
								break;
						}
					}
				}else if(str.charAt(i) == 'U') {
					car.state = 'u';
					if(y-1>=0 && arr[y-1][x] == '.') {
						car.x = x;
						car.y = y-1;
						arr[y][x] = '.';
						arr[y-1][x] = '^';
					}else
						arr[y][x] = '^';
				}else if(str.charAt(i) == 'D') {
					car.state = 'd';
					if(y+1<h && arr[y+1][x] == '.') {
						car.x = x;
						car.y = y+1;
						arr[y][x] = '.';
						arr[y+1][x] = 'v';
					}else
						arr[y][x] = 'v';
				}else if(str.charAt(i) == 'L') {
					car.state = 'l';
					if(x-1>=0 && arr[y][x-1] == '.') {
						car.x = x-1;
						car.y = y;
						arr[y][x] = '.';
						arr[y][x-1] = '<';
					}else
						arr[y][x] = '<';
				}else if(str.charAt(i) == 'R') {
					car.state = 'r';
					if(x+1<w && arr[y][x+1] == '.') {
						car.x = x+1;
						car.y = y;
						arr[y][x] = '.';
						arr[y][x+1] = '>';
					}else
						arr[y][x] = '>';
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
			
			System.out.print("#"+test_case+" "+sb);
		}
	}
	static class XY{
		int x;
		int y;
		char state;
		
		public XY(int x, int y,char state) {
			this.x = x;
			this.y = y;
			this.state = state;
		}
	}
}