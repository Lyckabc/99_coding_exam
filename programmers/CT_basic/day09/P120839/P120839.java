package programmers.CT_basic.day09.P120839;
/**
 * Class: P120839
 *
 * @author lyckabc
 * @date 2024-07-16 16:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120839 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "205";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(rsp));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            answer.append(c == '2' ? '0' : c == '0' ? '5' : '2');
        }
        return answer.toString();
    }
}
/* best solution
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String rsp) {
        //2 - 가위, 0 - 바위, 5 - 보
        Map<String, String> winNumbers = new HashMap<>();
        winNumbers.put("2", "0");
        winNumbers.put("0", "5");
        winNumbers.put("5", "2");

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            answer.append(winNumbers.get(rsp.substring(i, i+1)));
        }

        return answer.toString();
    }
}
 */