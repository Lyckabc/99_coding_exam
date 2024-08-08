package day18.P181864;
/**
 * Class: P181864
 *
 * @author lyckabc
 * @date 2024-08-08 12:43
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181864 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String pat = "AABB";
        String myString = "ABBAA";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(myString, pat));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String xStr = exchangeStr(myString);
        if (xStr.contains(pat)) {
            return 1;
        }
        return answer;
    }
    public String exchangeStr(String a) {
        StringBuilder changedStr = new StringBuilder();
        for (char c : a.toCharArray()) {
            changedStr.append(c == 'A' ? 'B' : 'A');
        }
        return changedStr.toString();
    }
}
/*
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}
 */