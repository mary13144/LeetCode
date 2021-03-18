package day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/11 18:43
 * @Version 1.0
 */
public class ValidParentheses20 {
    public boolean isValid(String s) {
        if (s.length()==0)
            return true;
        if (s.length()%2!=0)
            return false;
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        if (map.containsKey(s.charAt(0)))
            stack.push(s.charAt(0));
        else
            return false;
        for (int i = 1;i<s.length();i++){
            char flag = s.charAt(i);
            if (map.containsKey(flag))
                stack.push(flag);
            else {
                if (stack.empty())
                    return false;
                if (map.get(stack.peek())==flag)
                    stack.pop();
                else
                    return false;
            }
        }
        if (!stack.empty())
            return false;
        return true;
    }
}
