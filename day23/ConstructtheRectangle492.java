package day23;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/8 19:48
 * @Version 1.0
 */
public class ConstructtheRectangle492 {
    public int[] constructRectangle(int area) {
        int w =(int) Math.sqrt(area);
        while ((area%w)!=0){
            w--;
        }
        return new int[]{area/w,w};
    }
}
