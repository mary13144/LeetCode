package day39;

import java.util.Stack;
import java.util.TreeMap;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/24 16:19
 * @Version 1.0
 */
public class onetwothreePattern456 {
    //单调栈
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = len-1;i>=0;i--){
            if (nums[i]<max)
                return true;
            while (!stack.empty()&&stack.peek()<nums[i]){
                max=stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
    //官方解法：枚举3
//        public boolean find132pattern(int[] nums) {
//            // 1. 特判
//            int n = nums.length;
//            if(n < 3){
//                return false;
//            }
//
//            // 2. 定义左侧最小值
//            int leftMin = nums[0];
//
//            // 3. 将右侧所有元素放进到有序集合中
//            TreeMap<Integer,Integer> rightAll = new TreeMap<Integer,Integer>();
//            for(int k = 2;k < n;++k){
//                rightAll.put(nums[k],rightAll.getOrDefault(nums[k],0) + 1);
//            }
//
//            // 3. 枚举3
//            for(int j = 1;j < n - 1;++j){
//                // 3.1 满足132中的nums[i] < nums[j]的条件
//                if(leftMin < nums[j]){
//                    Integer next = rightAll.ceilingKey(leftMin + 1);        // ceilingKey：方法调用返回的最小的大于或等于的键，如果不存在这样的键在则返回null。（这里的作用是返回TreeMap 中的大于leftMin的最小值）
//                    if(next != null && next < nums[j]){                     // 如果这个最小值存在且小于nums[j]:说明满足132的整体条件
//                        return true;
//                    }
//                }
//                // 3.2 不满足132中：nums[i] < nums[j] 条件
//                leftMin = Math.min(leftMin, nums[j]);                       // 更新leftMin（nums[i]）的值
//                rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);   // 将有序集合中的nums[j + 1]对应的键值-1 相当于将“窗口”右移一位
//                if(rightAll.get(nums[j + 1]) == 0){                         // 若有序集合中的nums[j + 1]对应的键值==0 删除这个键值对
//                    rightAll.remove(nums[j + 1]);
//                }
//            }
//            // 枚举结束未找到返回false
//            return false;
//        }


}
