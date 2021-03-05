package day18;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/28 19:06
 * @Version 1.0
 */
public class ConvertaNumbertoHexadecimal405 {
    public String toHex(int num) {
        if (num==0)
            return "0";
        char[] flag = "0123456789abcdef".toCharArray();
        StringBuffer ans = new StringBuffer("");
        while (num!=0){
            ans.append(flag[num&15]);
            num=num>>>4;
        }
        return ans.reverse().toString();
    }
}
