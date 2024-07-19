package day13.P181888;
/**
 * Class: P181888
 *
 * @author lyckabc
 * @date 2024-07-19 22:27
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181888 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int[] answer = new int[lenNumList / n + (lenNumList % n == 0 ? 0 : 1)];
        for (int i = 0, j = 0; i < lenNumList; i+=n, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] num_list, int n) {
        Double length = Math.ceil(num_list.length/(n*1.0));
        int[] answer = new int[length.intValue()];

        for(int idx=0; idx<length; idx++) {
            answer[idx] = num_list[idx*n];
        }

        return answer;
    }
}
 */