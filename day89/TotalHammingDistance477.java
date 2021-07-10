package day89;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/28 17:14
 * @Version 1.0
 */
public class TotalHammingDistance477 {
    //效率太低
//    public int totalHammingDistance(int[] nums) {
//        int ans = 0;
//        int n = nums.length;
//        for (int i = 0;i<n;i++){
//            for (int j = i+1;j<n;j++){
//                int flag = nums[i]^nums[j];
//                ans+=Integer.bitCount(flag);
//            }
//        }
//        return ans;
//    }
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int zeronum ;
        int onenum ;
        for (int i = 31;i>=0;i--){
            zeronum = 0;
            onenum = 0;
            for (int x:nums){
                if (((x>>i)&1)==1){
                    onenum++;
                }else
                    zeronum++;
            }
            ans+=zeronum*onenum;
        }
        return ans;
    }
}
