package day14;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/24 23:26
 * @Version 1.0
 */
public class ReverseString344 {
    public void reverseString(char[] s) {
        if (s.length==0)
            return;
        char temp;
        for (int i = 0,j=s.length-1;i<j;i++,j--){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
