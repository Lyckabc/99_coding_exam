/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        P120896                                  **
 **        Made by Toji                          **
 **        12/26/2023 :2:54 PM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package P120896;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class P120896 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcadc";
        System.out.println(sol.solution(s));
        s = "abdc";
        System.out.println(sol.solution(s));
        s = "hello";
        System.out.println(sol.solution(s));

    }
}

class Solution {
    public static void main(String[] args) {
        String s1 = "abcabcadc";
        String s2 = "abdc";
        String s3 = "hello";

        System.out.println(solution(s1)); // "d"
        System.out.println(solution(s2)); // "abcd"
        System.out.println(solution(s3)); // "eho"
    }

    public static String solution(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Filter characters with count == 1 and collect to set for automatic sorting
        Set<Character> resultChars = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        // Join characters to build the result string
        return resultChars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
