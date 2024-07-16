package programmers.CT_basic.day08.P120833;
/**
 * Class: P120833
 *
 * @author lyckabc
 * @date 2024-07-16 13:43
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P120833 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(sol.solution(numbers, num1, num2)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1, j = 0; i <= num2; i++, j++) {
            answer[j] = numbers[i];
        }
        return answer;
    }
}

/*
best solution

import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

*/