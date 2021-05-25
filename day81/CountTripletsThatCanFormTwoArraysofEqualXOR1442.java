package day81;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/18 15:25
 * @Version 1.0
 */
public class CountTripletsThatCanFormTwoArraysofEqualXOR1442 {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0]=arr[0];
        for (int i = 1;i<n;i++){
            dp[i]=dp[i-1]^arr[i];
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            if (dp[i]==0)
                ans+=i;
            for (int j = i+1;j<n;j++){
                if (dp[i]==dp[j])
                    ans+=(j-i-1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CountTripletsThatCanFormTwoArraysofEqualXOR1442 test = new CountTripletsThatCanFormTwoArraysofEqualXOR1442();
        int i = test.countTriplets(new int[]{2, 3, 1, 6, 7});
        System.out.println(i);
    }
}
