package day38;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Mu Wenxin
 * @Date 2021/3/23 16:05
 * @Version 1.0
 */

public class NestedInteger implements Iterator<Integer> {
    private List<Integer> list = new ArrayList<>();
    private int index = 0;

    public NestedInteger(List<NestedInteger> nestedList) {
        add(nestedList);
    }

    public void add(List<NestedInteger> nestedList){
        for (NestedInteger flag:nestedList){
            if (flag.isInteger()){
                list.add(flag.getInteger());
            }else {
                add(flag.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        if (index<list.size())
            return true;
        else
            return false;
    }

    //防止编译器报错
    public boolean isInteger(){
        return true;
    }
    public Integer getInteger(){
        return new Integer(0);
    }
    public List<NestedInteger> getList(){
        return new ArrayList<>();
    }
}
