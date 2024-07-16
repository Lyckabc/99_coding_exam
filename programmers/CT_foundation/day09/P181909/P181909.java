package programmers.CT_foundation.day09.P181909;
/**
 * Class: P181909
 *
 * @author lyckabc
 * @date 2024-07-16 13:21
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181909 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String my_string = "banana";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(my_string)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

/* best solution
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myString) {
        return IntStream.range(0, myString.length()).mapToObj(myString::substring).sorted().toArray(String[]::new);
    }
}
*/