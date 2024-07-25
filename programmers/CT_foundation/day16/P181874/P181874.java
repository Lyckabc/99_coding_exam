package programmers.CT_foundation.day16.P181874;
/**
 * Class: P181874
 *
 * @author lyckabc
 * @date 2024-07-25 10:42
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181874 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abstract algebra";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'a') {
                answer += "A";
            } else if (c != 'A') {
                answer += Character.toLowerCase(c);
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
/*
class Solution {

    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;
    }
}
 */
/*
class Solution {
    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
 */