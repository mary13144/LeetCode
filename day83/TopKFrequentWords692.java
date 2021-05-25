package day83;

import java.util.*;

/**
 * @Author Mu Wenxin
 * @Date 2021/5/20 16:33
 * @Version 1.0
 */
public class TopKFrequentWords692 {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> flag = new TreeMap<>();
        for (int i = 0;i<words.length;i++){
            flag.put(words[i], flag.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(flag.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()- o1.getValue();
            }
        });
        List<String> ans = new ArrayList<>();
        for (int i = 0;i<k;i++){
            ans.add(list.get(i).getKey());
        }
        return ans;
    }
}
