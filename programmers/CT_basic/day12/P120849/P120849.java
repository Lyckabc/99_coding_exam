package programmers.CT_basic.day12.P120849;
/**
 * Class: P120849
 *
 * @author lyckabc
 * @date 2024-07-19 22:36
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120849 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "nice to meet you";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for(String vowel : vowels){
            if(my_string.contains(vowel)){
                my_string = my_string.replace(vowel, "");
            }
        }
        return my_string;
    }
}
 */
/*
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("a|e|i|o|u", "");
    }
}
 */