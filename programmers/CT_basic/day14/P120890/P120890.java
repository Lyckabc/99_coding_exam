package programmers.CT_basic.day14.P120890;
/**
 * Class: P120890
 *
 * @author lyckabc
 * @date 2024-07-20 19:06
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120890 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 13;
        int[] A = {10,11,12};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(A, a));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int curN = array[i];
            if (Math.abs(curN - n)  < Math.abs(min - n)) {
                min = curN;
            } else if (Math.abs(curN - n) == Math.abs(min - n)) {
                min = Math.min(min, curN);
                //가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
            }
        }
        return min;
    }
}
/*
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        return Math.min(array[Arrays.stream(array)
            .map(operand -> Math.abs(n - operand))
            .boxed()
            .collect(Collectors.toList())
            .indexOf(Arrays.stream(array)
            .map(operand -> Math.abs(n - operand))
            .min()
            .orElse(0))], 
        array[Arrays.stream(array)
            .map(operand -> Math.abs(n - operand))
            .boxed()
            .collect(Collectors.toList())
            .lastIndexOf(Arrays.stream(array)
            .map(operand -> Math.abs(n - operand))
            .min()
            .orElse(0)
            )]);
    }
}
 */