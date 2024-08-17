package programmers.CT_foundation.day20.P181855;
/**
 * Class: P181855
 *
 * @author lyckabc
 * @date 2024-08-16 23:28
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181855 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"a","bc","d","efg","hi"};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(strArr));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> lengthCount = new HashMap<>();
        
        for (String s : strArr) {
            int len = s.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : lengthCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        return maxCount;
    }
}
/*
class Solution {
    public int solution(String[] strArr) {
        return Arrays
        .stream(strArr)
        .collect(Collectors.groupingBy(String::length))
        .values()
        .stream()
        .max(Comparator.comparingInt(List::size))
        .orElse(Collections.emptyList())
        .size();
    }
}
 */

