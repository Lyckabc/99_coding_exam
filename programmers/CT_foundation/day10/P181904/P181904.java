package programmers.CT_foundation.day10.P181904;
/**
 * Class: P181904
 *
 * @author lyckabc
 * @date 2024-07-17 23:11
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181904 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, m, c));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int lenStr = my_string.length();
        int countPhrase = lenStr / m;
        String[] arr = new String[countPhrase];
        for (int i = 0; i < countPhrase; i++) {
            arr[i] = my_string.substring(i * m, (i + 1) * m);
            answer += arr[i].charAt(c - 1);
        }
        return answer;
    }
}
/* best speed solution AI
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder(my_string.length() / m);
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
 */
/* best code in comunity
class Solution {

    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

 */