package day15;

/**
 * @Author Mu Wenxin
 * @Date 2021/2/26 1:23
 * @Version 1.0
 */
public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()==0)
            return true;
        if (magazine.length()==0)
            return false;
        char[] note = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        for (int i = 0;i<note.length;i++){
            int flag = contain(note[i],mag);
            if (flag!=-1){
                mag[flag]=' ';
            }else
                return false;
        }
        return true;
    }
    int contain(char a,char[] b){
        for (int i = 0;i<b.length;i++){
            if (b[i]==a)
                return i;
        }
        return -1;
    }
}
