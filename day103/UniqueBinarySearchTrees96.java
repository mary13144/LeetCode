package day103;

/**
 * @Author Mu Wenxin
 * @Date 2021/6/18 20:28
 * @Version 1.0
 */
public class UniqueBinarySearchTrees96 {
    public int numTrees(int n) {
        int[] flag = new int[n+1];
        flag[1]=1;
        flag[0]=1;
        for (int i = 2;i<=n;i++){
            for (int j = 1;j<=i;j++){
                flag[i]=flag[j-1]*flag[i-j];
            }
        }
        return flag[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees96 test = new UniqueBinarySearchTrees96();
        int i = test.numTrees(4);
        System.out.println(i);
    }
}
