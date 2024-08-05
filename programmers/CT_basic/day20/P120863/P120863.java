package programmers.CT_basic.day20.P120863;
/**
 * Class: P120863
 *
 * @author lyckabc
 * @date 2024-08-06 04:40
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P120863 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String polynomial = "3x + 7 + x";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(polynomial));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String polynomial) {
        int xNum = 0;
        int num = 0;
        String[] formula = polynomial.split(" ");
        Stack<String> op = new Stack<>();
        for (String part : formula) {
            if (part.endsWith("x")) {
                if (part.equals("x")) {
                    xNum++;
                } else {
                    xNum += Integer.parseInt(part.replace("x", ""));
                }
            } else if (part.contains("+")) {
                continue;
            }
            else {
                num += Integer.parseInt(part);
            } 
        }
        StringBuilder sb = new StringBuilder();
        if (xNum != 0){
            if (xNum == 1) {
                sb.append("x");
            } else {
                sb.append(xNum).append("x");
            }
        }
        if (num != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(num);
        }

        return sb.length() == 0 ? "0" : sb.toString();    
    }
}
/*
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        int tmpxNum = 0;
        int tmpNum = 0;
        String op = "";
        String[] formula = polynomial.split(" ");
        for (int i = 0; i < formula.length; i++) {
            String str = formula[i];
            if (str.endsWith("x")) {
                tmpxNum = str.equals("x") ? 1 : Integer.parseInt(str.replace("x", ""));
            } else if (str.equals("+")) {
                op = "+";
            } else if (!str.endsWith("x")) {
                tmpNum = Integer.parseInt(str);
            } 
            if (i == formula.length - 1) {
                op = "1";
            }
            switch (op) {
                case "+" : xNum += tmpxNum;
                tmpxNum = 0;
                num += tmpNum;
                tmpNum = 0;
                op = "";
                case "1" : xNum += tmpxNum;
                tmpxNum = 0;
                num += tmpNum;
                tmpNum = 0;
                op = "";
            }
        }
        answer = xNum == 0 ? String.valueOf(num) : num == 0 ? String.valueOf(xNum) + "x" : String.valueOf(xNum) + "x" + " + " + String.valueOf(num); // 둘다 0일 때는 "0"출력하는 코드 삽입하면 됨.
        return answer;
    }
}
 */
/*
class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}
 */