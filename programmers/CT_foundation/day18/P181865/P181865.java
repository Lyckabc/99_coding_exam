package day18.P181865;
/**
 * Class: P181865
 *
 * @author lyckabc
 * @date 2024-08-08 12:11
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181865 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String binomial = "43 + 12";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(binomial));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int answer = Integer.parseInt(parts[0]);
        
        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            int num = Integer.parseInt(parts[i + 1]);

            switch (op) {
                case "+" : answer += num;
                break;
                case "-" : answer -= num;
                break;
                case "*" : answer *= num;
                break;
            }
        }
        
        return answer;    
    }
}