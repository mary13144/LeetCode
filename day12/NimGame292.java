package day12;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/23 2:46
 * @Version 1.0
 */
public class NimGame292 {
    public boolean canWinNim(int n) {
        if (n<=3)
            return true;
        return n%4!=0;
    }
}
