package programmers.CT_basic.day17.P120905;
/**
 * Class: P120905
 *
 * @author lyckabc
 * @date 2024-07-23 23:51
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120905 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 100;
        int[] numlist = {};
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(sol.solution(n, numlist)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int n, int[] numlist) {
        String answerStr = "";
        for (int i = 0; i < numlist.length; i++) {
            int tmp = numlist[i];
            if (tmp % n == 0) {
                answerStr += tmp;
                answerStr += " ";
            }
        }
        if (answerStr.length() == 0) {
            return new int[0];
        }
        String[] answerArr = answerStr.split(" ");
        int lenStr = answerArr.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = Integer.parseInt(answerArr[i]);
        }
        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
 */
/*
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
 */