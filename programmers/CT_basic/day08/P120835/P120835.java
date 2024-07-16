package programmers.CT_basic.day08.P120835;
/**
 * Class: P120835
 *
 * @author lyckabc
 * @date 2024-07-16 14:00
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
import java.util.HashMap;
public class P120835 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] emergency = {3, 76, 24};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(emergency)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] originEmergency = emergency.clone();
        Arrays.sort(emergency);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], emergency.length - i);
        }
        for (int i = 0; i < originEmergency.length; i++) {
            answer[i] = map.get(originEmergency[i]);
        }
        return answer;
    }
}

/* best ai solution
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = n - Arrays.binarySearch(sorted, emergency[i]);
            answer[i] = rank;
        }

        return answer;
    }
}
 */

 /*
best solution
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            int idx = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}
*/