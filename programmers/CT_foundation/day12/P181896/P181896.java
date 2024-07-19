package day12.P181896;
/**
 * Class: P181896
 *
 * @author lyckabc
 * @date 2024-07-19 11:31
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181896 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(num_list));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
/*
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList) {
        return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
    }
}
 */
