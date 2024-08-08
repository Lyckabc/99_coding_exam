package day18.P181867;
/**
 * Class: P181867
 *
 * @author lyckabc
 * @date 2024-08-07 09:25
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181867 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "oxooxoxxox";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(myString)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        int[] answer = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].length();
        }
        
        return answer;
    }
}
/*
class Solution {

    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] tmp = myString.split("x");
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i].length());
        }
        if(myString.endsWith("x")) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
 */
 