package day19.P181861;
/**
 * Class: P181861
 *
 * @author lyckabc
 * @date 2024-08-11 20:18
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181861 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5, 1, 4};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(arr));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr) {
        int totalLength = 0;
        for (int n : arr) {
            totalLength += n;
        }
        
        int[] result = new int[totalLength];
        
        int index = 0;
        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                result[index++] = n;
            }
        }
        
        return result;
    }
}