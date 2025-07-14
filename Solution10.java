import java.util.Stack;

public class Solution10 {
        boolean solution(String s) {
            boolean answer = true;
    Stack<Character> stack = new Stack<>();

    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);

        if(stack.isEmpty()){
            if(c==')'){
                return false;
            }else{
                stack.push(c);
            }
        }else{
            if(stack.peek()=='(' && c==')'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
    }

    if(!stack.isEmpty()) return false;


    return answer;
}
}
