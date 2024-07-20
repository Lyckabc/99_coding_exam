package programmers.CT_basic.day15.P120894;
/**
 * Class: P120894
 *
 * @author lyckabc
 * @date 2024-07-20 23:42
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120894 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "onetwothreefourfivesixseveneightnine";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < nums.length; i++) {
            numbers = numbers.replace(nums[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}
/*
class Solution {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }
}
 */
/*
import java.util.Map;

class Solution {
    private static final Map<String, Integer> CONTAINS = Map.of("zero", 0, "one", 1, "two", 2,"three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
    public long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        for (String s : numbers.split("")) {
            builder.append(s);
            if (CONTAINS.containsKey(builder.toString())) {
                answer.append(CONTAINS.get(builder.toString()));
                builder = new StringBuilder();
            }
        }
        return Long.parseLong(answer.toString());
    }
}
 */