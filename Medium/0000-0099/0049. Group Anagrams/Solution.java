import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // 排序后的string作为key
        // 1. str to char[] --> sort
        for (String str: strs){
            char[] s_char = str.toCharArray();
            Arrays.sort(s_char);
            String s_sort = new String(s_char);
            // 如果map中有s_sort，则
            map.computeIfAbsent(s_sort, key -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
