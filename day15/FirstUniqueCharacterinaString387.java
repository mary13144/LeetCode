package day15;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/26 2:05
 * @Version 1.0
 */
public class FirstUniqueCharacterinaString387 {
    public int firstUniqChar(String s) {
        int[] flag = new int[26];
        for (int i = 0;i<s.length();i++ ){
            flag[s.charAt(i)-'a']++;
        }
        for (int j = 0;j<s.length();j++){
            if (flag[s.charAt(j)-'a']==1)
                return j;
        }
        return -1;
    }
}
