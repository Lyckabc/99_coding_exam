import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    int l = 6 - i - j - k; 
                    if (isParallel(dots[i], dots[j], dots[k], dots[l])) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        return (long)(p2[1] - p1[1]) * (p4[0] - p3[0]) == (long)(p4[1] - p3[1]) * (p2[0] - p1[0]);
    }
}