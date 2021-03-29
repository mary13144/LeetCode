package day35;

import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/20 14:32
 * @Version 1.0
 */
public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        for (int i = 0;i<tokens.length;i++){
            if (tokens[i].equals("+")){
                temp = stack.pop()+stack.pop();
                stack.push(temp);
            }else if (tokens[i].equals("-")){
                int first = stack.pop();
                int second = stack.pop();
                temp = second-first;
                stack.push(temp);
            }else if (tokens[i].equals("*")){
                temp = stack.pop()*stack.pop();
                stack.push(temp);
            }else if (tokens[i].equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                temp = second/first;
                stack.push(temp);
            }else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation150 test = new EvaluateReversePolishNotation150();
        int i = test.evalRPN(new String[]{"4", "13", "5", "/", "+"});
        System.out.println(i);
    }
}
