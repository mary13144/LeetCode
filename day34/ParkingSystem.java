package day34;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/19 20:39
 * @Version 1.0
 */
public class ParkingSystem {
    private int bigcarstop=0;
    private int mediumcarstop=0;
    private int smallcarstop=0;
    public ParkingSystem(int big, int medium, int small) {
        this.bigcarstop=big;
        this.mediumcarstop=medium;
        this.smallcarstop=small;
    }

    public boolean addCar(int carType) {
        boolean ans = false;
        switch (carType){
            case 1:
                if (bigcarstop>0){
                    bigcarstop--;
                    ans=true;
                }
                break;
            case 2:
                if (mediumcarstop>0){
                    mediumcarstop--;
                    ans=true;
                }
                break;
            case 3:
                if (smallcarstop>0){
                    smallcarstop--;
                    ans=true;
                }
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        ParkingSystem test = new ParkingSystem(0,0,2);
        boolean b = test.addCar(1);
        System.out.println(b);
    }
}
