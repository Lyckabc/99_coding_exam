package programmers.CT_foundation.day19.P181862;
/**
 * Class: P181862
 *
 * @author lyckabc
 * @date 2024-08-10 12:30
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181862 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myStr = "baconlettucetomato";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(myStr)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String myStr) {
        StringBuilder tmpAnswer = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (c != 'a' && c != 'b' && c != 'c') {
                str.append(c);
            } else {
                if (str.length() > 0) {
                    tmpAnswer.append(str).append(" ");
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            tmpAnswer.append(str);
        }

        String[] answer = {};
        if(tmpAnswer.toString().isEmpty()) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = tmpAnswer.toString().trim().split(" ");
        }
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }
}

 */