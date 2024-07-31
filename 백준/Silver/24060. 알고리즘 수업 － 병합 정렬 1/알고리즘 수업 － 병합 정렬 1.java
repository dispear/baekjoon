import java.io.*;
import java.util.*;

public class Main {
    static int[] tmp;
    static int result = -1;
    static int cnt = 0;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, arr.length - 1);

        sb.append(result);

        System.out.println(sb);
    }

    static void merge_sort(int[] arr,int p,int r){
        if(cnt > m)
            return;
        if(p<r){
            int q = (p+r)/2;
            merge_sort(arr,p,q);
            merge_sort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }

    static void merge(int[] arr,int p,int q,int r){
        int a = p;
        int b = q+1;
        int t = 0;

        while(a<= q && b <=r){
            if(arr[a]<=arr[b]){
                tmp[t++] = arr[a++];
            }else {
                tmp[t++] = arr[b++];
            }
        }
        while(a<=q){
            tmp[t++] = arr[a++];
        }
        while(b<=r){
            tmp[t++] = arr[b++];
        }

        a = p;
        t = 0;
        while(a <= r){
            cnt++;

            if(cnt == m){
                result = tmp[t];
                break;
            }

            arr[a++] = tmp[t++];
        }
    }

}