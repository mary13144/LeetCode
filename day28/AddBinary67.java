package day28;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/13 18:07
 * @Version 1.0
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
        if (a==null||a.length()==0)
            return b;
        if (b==null||b.length()==0)
            return a;
        StringBuffer ans = new StringBuffer();
        int len1 = a.length()-1;
        int len2 = b.length()-1;
        int flag = 0;
        while (len1>=0||len2>=0){
            if (len1>=0){
                flag+=a.charAt(len1--)-'0';
            }
            if (len2>=0){
                flag+=b.charAt(len2--)-'0';
            }
            ans.append(flag%2+"");
            if (flag>=2){
                flag=1;
            }else {
                flag=0;
            }
        }
        if (flag==1){
            return "1"+ans.reverse().toString();
        }
        return ans.reverse().toString();
    }
}
