package day13.P181891;
/**
 * Class: P181891
 *
 * @author lyckabc
 * @date 2024-07-19 17:39
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181891 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int[] preArr = Arrays.copyOfRange(num_list, 0, n);
        int[] postArr = Arrays.copyOfRange(num_list, n, lenNumList);
        int lenArr = preArr.length + postArr.length;
        int[] answer = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            if (i < lenNumList - n) {
                answer[i] = postArr[i];
            } else {
                answer[i] = preArr[i - (lenNumList - n)];
            }
        }
        return answer;
    }
}
/*
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream
        .range(0, num_list.length)
        .map(i -> num_list[(i + n) % num_list.length])
        .toArray();
    }
}
 */
/*
class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        for (int i = 0;i < n;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
}
 */