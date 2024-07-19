package programmers.CT_basic.day13.P120888;
/**
 * Class: P120888
 *
 * @author lyckabc
 * @date 2024-07-19 23:35
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.HashMap;
public class P120888 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "We are the world";

        long startTime = System.nanoTime();

        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashMap<Character, Integer> set = new HashMap<>();
        for (char c : my_string.toCharArray()) {
            if (!set.containsKey(c)) {
                set.put(c, 1);
                answer += c;
            }
        }
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
 */
/*
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
 */