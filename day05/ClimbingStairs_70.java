package day05;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/15 22:54
 * @Version 1.0
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if (n==1||n==2){
            return n;
        }
        int [] nums = new int[n];
        nums[0]=1;
        nums[1]=2;
        for (int i=2;i<n;i++){
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n-1];

    }

    public static void main(String[] args) {
        ClimbingStairs_70 test = new ClimbingStairs_70();
        int i = test.climbStairs(4);
        System.out.println(i);
    }
}
