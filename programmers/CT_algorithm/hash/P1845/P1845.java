package programmers.CT_algorithm.hash.P1845;
/**
 * Class: P1845
 *
 * @author lyckabc
 * @date 2024-07-15 15:52
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.HashMap;
public class P1845 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 1, 2, 3};

        long startTime = System.nanoTime();

        System.out.println(sol.solution(nums));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int numPocketTake = nums.length / 2;
        int numType = map.size();
        return Math.min(numPocketTake, numType);
    }
}