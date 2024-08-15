package programmers.CT_foundation.day20.P181856;
/**
 * Class: P181856
 *
 * @author lyckabc
 * @date 2024-08-15 18:08
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181856 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {49, 13};
        int[] arr2 = {10, 11, 2};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(arr1, arr2));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 > len2) return 1;
        else if (len2 > len1) return -1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        if (sum1 > sum2) return 1;
        else if (sum2 > sum1) return -1;
        return answer;
    }
}
/*
 class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
    }
}
 */