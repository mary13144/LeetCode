package day68;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/26 12:22
 * @Version 1.0
 */
public class CapacityToShipPackagesWithinDDays1011 {
    public int shipWithinDays(int[] weights, int D) {
        int sum = 0;
        //记录数组中最大数，返回值应该至少大于等于这个数
        int max = 0;
        for (int i = 0;i<weights.length;i++){
            sum+=weights[i];
            if (weights[i]>max)
                max=weights[i];
        }
        int left = 0;
        int right = sum;
        //记录最后一次寻找到的左边界，最后寻找到的数就是答案。
        int ans = 0;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (mid>=max&&issucceed(weights,mid,D)){
                ans=mid;
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean issucceed(int[] weights,int temp,int D){
        int flag = 1;
        int sumwight = 0;
        for (int i = 0;i<weights.length;i++){
            if (temp>=weights[i]+sumwight){
                sumwight+=weights[i];
            }else {
                sumwight=weights[i];
                flag++;
            }
            if (flag>D)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays1011 test = new CapacityToShipPackagesWithinDDays1011();
        boolean issucceed = test.issucceed(new int[]{1, 2, 3, 1,1}, 2, 4);
        System.out.println(issucceed);
    }
}
