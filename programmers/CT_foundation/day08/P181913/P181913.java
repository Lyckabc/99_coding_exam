package programmers.CT_foundation.day08.P181913;
/**
 * Class: P181913
 *
 * @author lyckabc
 * @date 2024-07-16 11:41
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181913 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
        String my_string = "rermgorpsam";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, queries));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    char[] arr;
    public String solution(String my_string, int[][] queries) {
        arr = my_string.toCharArray();
        for (int[] query : queries) {
            reverseChar(query[0],query[1]);
        }
        return String.valueOf(arr);
    }
    public void reverseChar(int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[end - i + start];
            arr[end - i + start] = temp;
        }
    }
}
/* ai solution
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            StringBuilder temp = new StringBuilder(answer.substring(queries[i][0], queries[i][1] + 1));
            answer.replace(queries[i][0], queries[i][1] + 1, temp.reverse().toString());
        }
        return answer.toString();
    }
}
 */
/* best solution
class Solution {

    char[] arr;

    public String solution(String my_string, int[][] queries) {

        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        return new String(arr);
    }

    private void reverse(int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}
 */