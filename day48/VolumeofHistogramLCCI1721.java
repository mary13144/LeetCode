package day48;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/2 20:44
 * @Version 1.0
 */
public class VolumeofHistogramLCCI1721 {
    public int trap(int[] height) {
        int n = height.length;
        if (n==0)
            return 0;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxleft=height[0];
        for (int i = 1;i<n;i++){
            if (height[i]>maxleft)
                maxleft=height[i];
            left[i]=maxleft;
        }
        int maxright=height[n-1];
        for (int i = n-2;i>=0;i--){
            if (height[i]>maxright)
                maxright=height[i];
            right[i]=maxright;
        }
        int ans = 0;
        for (int i=1;i<n-1;i++){
            ans+=Math.min(right[i],left[i])-height[i];
        }
        return ans;
    }
}
