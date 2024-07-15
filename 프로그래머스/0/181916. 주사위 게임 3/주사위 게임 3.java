import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
       
        int answer = 0;
        if (map.size() == 1) {
            answer = 1111 * a;
        } else if (map.size() == 2) {
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            Map.Entry<Integer, Integer> first = iterator.next();
            Map.Entry<Integer, Integer> second = iterator.next();
            if (first.getValue() == 3 || second.getValue() == 3) {
                int p = first.getValue() == 3 ? first.getKey() : second.getKey();
                int q = first.getValue() == 1 ? first.getKey() : second.getKey();
                answer = (int) Math.pow(10 * p + q, 2);
            } else {
                int p = first.getKey();
                int q = second.getKey();
                answer = (p + q) * Math.abs(p - q);
            }
        } else if (map.size() == 3) {
            int singleValue = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) {
                    singleValue = entry.getKey();
                }
            }
            int product = 1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    product *= entry.getKey();
                }
            }
            answer = product;
        } else { 
            int minNum = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                minNum = Math.min(minNum, entry.getKey());
            }
            answer = minNum;
        }
        return answer;
    }
}