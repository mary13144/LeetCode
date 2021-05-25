package day64;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/20 8:17
 * @Version 1.0
 */
public class ImplementstrStr_kmp {
    //超时
//    public int strStr(String haystack, String needle) {
//        if (needle.length()==0)
//            return 0;
//        if (haystack.length()==0)
//            return -1;
//        for (int i = 0;i<haystack.length();i++){
//            if (haystack.charAt(i)==needle.charAt(0)){
//                int ans = i;
//                int j = 1;
//                int flag = i+1;
//                while (flag<haystack.length()&&j<needle.length()){
//                    if (haystack.charAt(flag)==needle.charAt(j)){
//                        flag++;
//                        j++;
//                    }else
//                        break;
//                }
//                if (j==needle.length())
//                    return ans;
//            }
//        }
//        return -1;
//    }
    //kmp
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m==0)
            return 0;
        if (n==0)
            return -1;
        int[] next = new int[m];
        int j = 0;
        next[0]=j;
        for (int i = 1;i<m;i++){
            while (j>0&&needle.charAt(i)!=needle.charAt(j)){
                j=next[j-1];
            }
            if (needle.charAt(i)==needle.charAt(j))
                j++;
            next[i]=j;
        }
        j=0;
        for (int i = 0;i<n;i++){
            while (j>0&&haystack.charAt(i)!=needle.charAt(j)){
                j=next[j-1];
            }
            if(haystack.charAt(i)==needle.charAt(j))
                j++;
            if (j==m)
                return i-m+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr_kmp test = new ImplementstrStr_kmp();
        int i = test.strStr("mississippi", "issip");
        System.out.println(i);
    }
}
