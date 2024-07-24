package programmers.CT_basic.day17.P120907;
/**
 * Class: P120907
 *
 * @author lyckabc
 * @date 2024-07-25 02:10
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120907 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(quiz)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] quiz) {
        int lenStr = quiz.length;
        String[] answer = new String[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = calculDecipher(quiz[i]) ? "O" : "X";
        }
        
        return answer;
    }
    public boolean calculDecipher(String quizStr) {
        String tmp = "";
        boolean answer = false;
        int total = 0;
        String[] idxStr = quizStr.split(" ");
        int oper = -1; // 0 = plus, 1 = minus, 2 = =;
        for (int i = 0; i < idxStr.length; i++) {
            tmp = idxStr[i];
            if (tmp.equals("+") || tmp.equals("-") || tmp.equals("=")){
                if (tmp.equals("+")) oper = 0;
                else if (tmp.equals("-")) oper = 1;
                else if (tmp.equals("=")) oper = 2;
            } else {
                int tmpNum = Integer.parseInt(tmp);
                if (oper <= 0) {
                    total += tmpNum;
                } else if (oper == 1) {
                    total -= tmpNum;
                } else if (oper == 2) {
                    if (total == tmpNum) return true;
                }
            } 
        }
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            answer[i] = calculDecipher(quiz[i]) ? "O" : "X";
        }
        return answer;
    }

    public boolean calculDecipher(String quizStr) {
        String[] idxStr = quizStr.split(" ");
        int total = Integer.parseInt(idxStr[0]);
        int oper = 0; // 0 = plus, 1 = minus

        for (int i = 1; i < idxStr.length; i += 2) {
            if (idxStr[i].equals("=")) {
                return total == Integer.parseInt(idxStr[i + 1]);
            }
            
            int num = Integer.parseInt(idxStr[i + 1]);
            if (idxStr[i].equals("+")) {
                total += num;
            } else if (idxStr[i].equals("-")) {
                total -= num;
            }
        }
        return false; // Should not reach here if input is valid
    }
}
 */
/*
class Solution {
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}
 */