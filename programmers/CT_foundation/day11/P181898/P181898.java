package programmers.CT_foundation.day11.P181898;

/**
 * Class: P181898
 *
 * @author lyckabc
 * @date 2024-07-18 22:12
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181898 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(arr, idx));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < idx) {
                continue;
            }else {
                if (arr[i] == 1) {
                    answer = i;
                    break;
                }else{
                    answer = -1;
                }
            }
        }
        return answer;
    }
}
/*
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}
 */