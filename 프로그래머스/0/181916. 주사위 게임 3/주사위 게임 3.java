import java.util.HashMap;
import java.util.Map;

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
            int p = 0, q = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 3) {
                    p = entry.getKey();
                } else if (entry.getValue() == 1) {
                    q = entry.getKey();
                } else if (entry.getValue() == 2) {
                    p = (p == 0) ? entry.getKey() : p;
                    q = entry.getKey();
                }
            }
            if (map.containsValue(3)) {
                answer = (int) Math.pow(10 * p + q, 2);
            } else {
                answer = (p + q) * Math.abs(p - q);
            }
        } else if (map.size() == 3) {
            int product = 1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    product *= entry.getKey();
                }
            }
            answer = product;
        } else {
            int minNum = Integer.MAX_VALUE;
            for (int key : map.keySet()) {
                minNum = Math.min(minNum, key);
            }
            answer = minNum;
        }
        return answer;
    }
}