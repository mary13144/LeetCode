package day99;

import java.util.Arrays;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/14 11:09
 * @Version 1.0
 */
public class MaximumNumberofRemovableCharacters1898 {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0;
        int right = removable.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            StringBuffer buffer = new StringBuffer(s);
            for (int i = 0;i<=mid;i++){
                buffer.setCharAt(removable[i],' ');
            }
            if (checkstr(buffer.toString(),p))
                left=mid+1;
            else
                right=mid-1;
        }
        return left;
    }
    public boolean checkstr(String s1,String s2){
        int i = 0,j = 0;
        int n = s1.length(),m = s2.length();
        while (i<n&&j<m){
            if (s1.charAt(i)==s2.charAt(j))
                j++;
            i++;
        }
        return j==m;
    }
}
