import java.util.*;

public class Main{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }
    public static int solution(String input) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char ch = '\0';

        for(char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }else{
                stack.pop();
                if(ch == '('){
                    if(!stack.empty()) {
                        count += stack.size();
                    }
                }else{
                    count += 1;
                }
            }
            ch = c;
        }

        return count;
    }
}