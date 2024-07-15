package day07.P181918;

/**
 * Class: P181918
 *
 * @author lyckabc
 * @date 2024-07-15 15:13
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class P181918 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 4, 2, 5, 3};

        long startTime = System.nanoTime();
        for (int num : sol.solution(arr)) {
            System.out.print(num + " ");
        }

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int stkSize = stkList.size();
            if (stkSize == 0 || stkList.get(stkSize - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            }
            else {
                stkList.remove(stkSize - 1);
            }
        }
        return stkList.stream().mapToInt(j -> j).toArray();
    }
}
/* stack으로 풀기 best. optimize code
 class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }
}
 */