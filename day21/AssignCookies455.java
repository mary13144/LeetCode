package day21;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/4 1:02
 * @Version 1.0
 */
public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length==0||s.length==0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int flag = 0;
        int count = 0;
        for (int i = 0;i<g.length;i++){
            for (int j=flag;j<s.length;j++){
                if (g[i]<=s[j]){
                    count++;
                    flag=j+1;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        AssignCookies455 test = new AssignCookies455();
        int contentChildren = test.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        System.out.println(contentChildren);
    }
}
