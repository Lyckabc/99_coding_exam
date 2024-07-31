package programmers.CT_foundation.day17.P181868;
/**
 * Class: P181868
 *
 * @author lyckabc
 * @date 2024-07-31 12:19
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181868 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "i    love  you";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(my_string)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String my_string) {
        
        String[] split = my_string.split(" ");
        String answer = "";
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                answer += split[i];
                answer += " ";
            }
        }
        return answer.split(" ");
    }
}
/*
class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
    }
}
 */
/*
class Solution {
    public String[] solution(String myString) {
        return myString.trim().split("\\s+");
    }
}
 */