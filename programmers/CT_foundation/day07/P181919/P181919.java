package day07.P181919;

/**
 * Class: P181919
 *
 * @author lyckabc
 * @date 2024-07-15 15:01
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
public class P181919 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        long startTime = System.nanoTime();
        for (int num : sol.solution(n)) {
            System.out.print(num + " ");
        }

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> collatzList = new ArrayList<>();
        while (n != 1) {
            collatzList.add(n);
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }
        collatzList.add(n);
        return collatzList.stream().mapToInt(i -> i).toArray();
    }
}