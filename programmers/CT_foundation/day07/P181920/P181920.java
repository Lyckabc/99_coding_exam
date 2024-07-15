package day07.P181920;
/**
 * Class: P181920
 *
 * @author lyckabc
 * @date 2024-07-15 14:51
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
public class P181920 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int start_num = 3;
        int end_num = 10;


        long startTime = System.nanoTime();
        for (int num : sol.solution(start_num,end_num)) {
            System.out.print(num + " ");
        }

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int start_num, int end_num) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}