package programmers.CT_basic.day16.P120902;
/**
 * Class: P120902
 *
 * @author lyckabc
 * @date 2024-07-21 23:31
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120902 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "3 - 4";

        long startTime = System.nanoTime();

        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        int curNum = 0;
        String operand = "";
        answer = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].charAt(0) >= '0' && strArr[i].charAt(0) <= '9') {
                curNum = Integer.parseInt(strArr[i]);
                switch (operand) {
                    case "+":
                        answer += curNum;
                        break;
                    case "-":
                        answer -= curNum;
                        break;
                }
            } else {
                operand = strArr[i];
            }
        }
        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
}
 */
/*
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean sign = true;
        String[] sarr = my_string.split(" ");
        for(int i=0; i<sarr.length; i++){
            if(i%2==0){
                answer += sign? Integer.parseInt(sarr[i]):-Integer.parseInt(sarr[i]);
            }else{
                sign = sarr[i].equals("+");
            }
        }
        return answer;
    }
}
 */
