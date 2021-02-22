package day03;


/**
 * @Author Mu Wenxin
 * @Date 2021/2/13 21:11
 * @Version 1.0
 */
public class Palindrome_Number9 {
    public boolean isPalindrome(int x) {

        if (x==0)
            return true;
        if (x>0){
            int x1=x;
            int temp=0;
            int pal=0;
            while (x1!=0){
                temp=x1%10;
                x1=x1/10;
                pal=pal*10+temp;
            }
            if (pal==x){
                return true;
            }else{
                return false;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int x=121;
        Palindrome_Number9 test= new Palindrome_Number9();
        boolean palindrome = test.isPalindrome(x);
        System.out.println(palindrome);
    }
}
