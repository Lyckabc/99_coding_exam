package programmers.CT_foundation.day17.P181869;
/**
 * Class: P181869
 *
 * @author lyckabc
 * @date 2024-07-31 12:15
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181869 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "i love you";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(my_string)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String my_string) {
        
        return my_string.split(" ");
    }
}