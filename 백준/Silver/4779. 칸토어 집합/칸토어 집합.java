import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int n = Integer.parseInt(input);
            System.out.println(cantoa(n));
        }

    }

    static String cantoa(int n){
        if(n == 0)
            return "-";
        else{
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Math.pow(3,n-1); i++) {
                sb.append(" ");
            }
            String str = sb.toString();
            return str = cantoa(n - 1) + str + cantoa(n - 1);
        }
    }
}