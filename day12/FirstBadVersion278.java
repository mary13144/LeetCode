package day12;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/22 23:50
 * @Version 1.0
 */
public class FirstBadVersion278 {
    //为了防止编译器报错
    boolean isBadVersion(int x){
        return true;
    }
    public int firstBadVersion(int n) {
        if (isBadVersion(1)==true)
            return 1;
        int low = 1;
        int high = n;
        int mid = 0;
        while (low<=high){
            mid = low+(high-low)/2;
            if (isBadVersion(mid)==false&&isBadVersion(mid+1)==true)
                return mid+1;
            if (isBadVersion(mid)==true&&isBadVersion(mid+1)==true)
                high=mid-1;
            if (isBadVersion(mid)==false&&isBadVersion(mid+1)==false)
                low=mid+1;
        }
        return -1;
    }
}
