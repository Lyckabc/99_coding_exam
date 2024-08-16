import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> lengthCount = new HashMap<>();
        
        for (String s : strArr) {
            int len = s.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : lengthCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}