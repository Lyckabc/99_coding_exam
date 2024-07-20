package programmers.CT_basic.day15.P120895;
/**
 * Class: P120895
 *
 * @author lyckabc
 * @date 2024-07-20 23:46
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120895 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, num1, num2));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        answer = replaceIdxStr(my_string, num1, num2);    
        return answer;
    }
    public String replaceIdxStr(String str, int idx1, int idx2) {
        char[] tmpStr = str.toCharArray();
        char tempC = tmpStr[idx1];
        tmpStr[idx1] = tmpStr[idx2];
        tmpStr[idx2] = tempC;
        return new String(tmpStr);
    }
    
}
/*
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
        return answer;
    }
}
 */