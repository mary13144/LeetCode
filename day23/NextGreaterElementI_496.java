package day23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/8 19:53
 * @Version 1.0
 */
public class NextGreaterElementI_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap();
        Stack stack = new Stack();
        stack.push(nums2[0]);
        int i = 1;
        while (i<nums2.length){
            if (stack.empty()){
                stack.push(nums2[i]);
                i++;
                continue;
            }
            if (nums2[i]<(int)stack.peek()){
                stack.push(nums2[i]);
                i++;
            }else {
                int pop = (int)stack.pop();
                map.put(pop,nums2[i]);
            }
        }
        for (int j = 0;j<nums1.length;j++){
            Integer flag = map.get(nums1[j]);
            if (flag!=null){
                nums1[j]=flag;
            }else{
                nums1[j]=-1;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        NextGreaterElementI_496 test = new NextGreaterElementI_496();
        int[] ints = test.nextGreaterElement(new int[]{2,4}, new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
}
