package programmers.CT_foundation.day20.P181853;
/**
 * Class: P181853
 *
 * @author lyckabc
 * @date 2024-08-19 08:59
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181853 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
 */
/*
class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
            .sorted()
            .limit(5)
            .toArray();
    }
}
 */