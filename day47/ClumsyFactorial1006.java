package day47;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/1 22:37
 * @Version 1.0
 */
public class ClumsyFactorial1006 {
    public int clumsy(int N) {
        if (N<4){
            if (N==3){
                return (N*(N-1)/(N-2));
            }else if (N==2){
                return (N*(N-1));
            }else if (N==1){
                return N;
            }
        }
        int u = N%4;
        int sum = (N*(N-1)/(N-2)+(N-3));
        N=N-4;
        while (N>u){
            int flag = (N*(N-1)/(N-2)-(N-3));
            sum-=flag;
            N-=4;
        }
        if (u!=0){
            if (u==3){
                sum-=(N*(N-1)/(N-2));
            }else if (u==2){
                sum-=(N*(N-1));
            }else if (u==1){
                sum-=N;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ClumsyFactorial1006 test = new ClumsyFactorial1006();
        test.clumsy(10);
    }
}
