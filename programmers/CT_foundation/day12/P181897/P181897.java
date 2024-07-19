package day12.P181897;

/**
 * Class: P181897
 *
 * @author lyckabc
 * @date 2024-07-19 10:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P181897 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int[] slicer = { 1, 5, 2 };
        int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(n, slicer, num_list)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int lenNumList = num_list.length;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};
        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, lenNumList);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                answer = new int[(b - a) / c + 1];
                for (int i = a, j = 0; i <= b; i += c, j++) {
                    answer[j] = num_list[i];
                }
                break;
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
 */