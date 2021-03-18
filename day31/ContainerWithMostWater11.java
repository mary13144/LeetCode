package day31;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/16 16:19
 * @Version 1.0
 */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        if (height.length==2)
            return Math.min(height[0],height[1]);
       int ans = 0;
       int i = 0;
       int j = height.length-1;
       while (i<j){
           int high = height[i]<height[j]?height[i]:height[j];
           int square = (j-i)*high;
           if (square>ans)
               ans=square;
           if (height[i]==high)
               i++;
           else
               j--;
       }
       return ans;
    }
}
