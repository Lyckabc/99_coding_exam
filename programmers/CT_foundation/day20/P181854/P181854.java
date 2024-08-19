package programmers.CT_foundation.day20.P181854;
/**
 * Class: P181854
 *
 * @author lyckabc
 * @date 2024-08-17 23:49
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181854 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 27;
        int[] arr = {49, 12, 100, 276, 33};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr, int n) {
        int lenArr = arr.length;
        int[] answer = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            if (lenArr % 2 == 1 && i % 2 == 0) {
                answer[i] += arr[i] + n;
            } else if (lenArr % 2 == 0 && i % 2 == 1) {
                answer[i] += arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
}
 */