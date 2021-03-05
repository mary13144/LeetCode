package day19;

import java.lang.management.ManagementFactory;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/2 2:40
 * @Version 1.0
 */
public class NumberofSegmentsinaString434 {
    public int countSegments(String s) {
        if (s.length()==0)
            return 0;
        if (s.length()==1){
            if (s.charAt(0)!=' ')
                return 1;
        }
        int count = 0;
        for (int i = 0;i<s.length()-1;i++){
            if (i==0&&s.charAt(i)!=' ')
                count++;
            if (s.charAt(i)==' '&&s.charAt(i+1)!=' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberofSegmentsinaString434 test = new NumberofSegmentsinaString434();
        int i = test.countSegments(", , , ,        a, eaefa");
        System.out.println(i);
    }

}
