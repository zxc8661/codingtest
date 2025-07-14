import java.util.Stack;

public class Solution13 {
    public int[] solution(int[] p) {
        int[] answer = new int[p.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<p.length;i++){
            while(!stack.isEmpty() && p[stack.peek()]>p[i]){
                answer [stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            answer[stack.peek()] = p.length-stack.peek()-1;
            stack.pop();
        }


        return answer;
    }
}
