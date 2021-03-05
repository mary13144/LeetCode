package day18;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 22:44
 * @Version 1.0
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            if (i%3==0&&i%5==0){
                ans.add("FizzBuzz");
                continue;
            }
            if (i%3==0){
                ans.add("Fizz");
                continue;
            }
            if (i%5==0){
                ans.add("Buzz");
                continue;
            }
            ans.add(i+"");
        }
        return ans;
    }
}
