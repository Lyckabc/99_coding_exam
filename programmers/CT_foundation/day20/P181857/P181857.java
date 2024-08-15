package programmers.CT_foundation.day20.P181857;
/**
 * Class: P181857
 *
 * @author lyckabc
 * @date 2024-08-15 17:55
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181857 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3, 4};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(A)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr) {
        int len = powerOfTwo(arr.length);
        int[] answer = new int[len];
        for (int i = 0; i < answer.length; i++) {
            if (i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    public int powerOfTwo(int length) {
        int nThPower = 1;
        while (nThPower < length) {
            nThPower *= 2;
        }
        return nThPower;
    }
}
/*
class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
 */
/*
class Solution {

    public int[] solution(int[] arr) {

        int len = arr.length;
        int tmp = 1;

        while (tmp < len) {
            tmp *= 2;
        }

        int[] answer = new int[tmp];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
 */