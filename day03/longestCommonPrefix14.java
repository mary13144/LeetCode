package day03;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/13 21:28
 * @Version 1.0
 */
public class longestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        String ans=strs[0];
        for (int i = 1;i<strs.length;i++){
            int j=0;
            for (;j<ans.length()&&j<strs[i].length();j++){
                if (ans.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            ans=ans.substring(0,j);
            if (ans.equals(""))
                return ans;
        }
        return ans;


    }

    public static void main(String[] args) {
        String[] str=new String[]{"dog","racecar","car"};
        longestCommonPrefix14 test=new longestCommonPrefix14();
        String s = test.longestCommonPrefix(str);
        System.out.println(s);
    }
}
