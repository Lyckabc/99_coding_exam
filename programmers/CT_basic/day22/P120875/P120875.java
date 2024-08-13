package programmers.CT_basic.day22.P120875;
/**
 * Class: P120875
 *
 * @author lyckabc
 * @date 2024-08-13 13:50
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P120875 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] dots = {{3,5},{4,1},{2,4},{5,10}};
        // int[][] dots = {{1,4},{9,2},{3,8},{11,6}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(dots));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        HashMap<Double, Integer> map = new HashMap<>();
        int x = 0;
        int y = 0;
        for (int i = 0; i < dots.length; i++) {
            x = dots[i][0];
            y = dots[i][1];
            for (int j = i + 1; j < dots.length; j++) {
                int tmpX = (dots[j][0] - x);
                int tmpY = (dots[j][1] - y);
                double slope;
                if (tmpX == 0 && tmpY == 0) slope = Double.POSITIVE_INFINITY;
                else {
                    slope = tmpY / tmpX;
                }
                if (map.containsKey(slope)) return 1;
                map.put(slope, 1);
            }
        }
        return answer;
    }
}