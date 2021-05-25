package day74;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/7 15:55
 * @Version 1.0
 */
public class XOROperationinanArray1486 {
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1;i<n;i++){
            int flag = start+2*i;
            ans^=flag;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(4^5^6^7);
    }
}
