package programmers.CT_foundation.day08.P181916;
/**
 * Class: P181916
 *
 * @author lyckabc
 * @date 2024-07-15 23:23
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
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

/* best solution
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
 */