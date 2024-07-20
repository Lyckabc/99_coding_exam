package programmers.CT_basic.day15.P120897;
/**
 * Class: P120897
 *
 * @author lyckabc
 * @date 2024-07-20 23:55
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120897 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 24;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(",");
            }
        }
        int[] answer = Arrays.stream(sb.toString().split(",")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}
/*
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
 */
/*
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
 */