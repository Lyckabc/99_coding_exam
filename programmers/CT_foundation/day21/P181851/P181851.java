package programmers.CT_foundation.day21.P181851;
/**
 * Class: P181851
 *
 * @author lyckabc
 * @date 2024-09-03 05:51
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181851 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean[] attendance = {true,true, true};
        int[] rank = {1, 2, 3};


        long startTime = System.nanoTime();
        System.out.println(sol.solution(rank,attendance));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int lenArr = rank.length;
        for (int i = 0; i < lenArr; i++) {
            if (attendance[i]) map.put(rank[i], i);
        }
        lenArr = map.size();
        int[] rankArr = new int[lenArr];
        int idx = 0;
        for (int num : map.keySet()) {
            rankArr[idx++] = num;
        }
        Arrays.sort(rankArr);
        answer = map.get(rankArr[0]) * 10000 + map.get(rankArr[1]) * 100 + map.get(rankArr[2]);
        
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3L)
                .reduce((current, next) -> current * 100 + next)
                .get();
    }
}
 */