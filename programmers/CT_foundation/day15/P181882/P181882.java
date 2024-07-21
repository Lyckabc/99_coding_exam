package programmers.CT_foundation.day15.P181882;
/**
 * Class: P181882
 *
 * @author lyckabc
 * @date 2024-07-20 23:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181882 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3, 100, 99, 98};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(A)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (tmp >= 50 && tmp % 2 == 0) {
                arr[i] = tmp / 2;
            } else if (tmp < 50 && tmp % 2 != 0) {
                arr[i] = tmp * 2;
            }
            
        }
        return arr;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
        .map(operand -> operand >= 50 && operand % 2 == 0 ? operand / 2 : operand < 50 && operand % 2 == 1 ? operand * 2 : operand)
        .toArray();
    }
}
 */