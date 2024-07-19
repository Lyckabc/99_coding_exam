package day12.P181894;
/**
 * Class: P181894
 *
 * @author lyckabc
 * @date 2024-07-19 11:46
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181894 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 1, 4, 5, 2, 9};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int lenArr = arr.length;
        for (int i = 0; i < lenArr; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            } 
        }
        if (min == Integer.MAX_VALUE) return new int[] {-1};
        int[] answer = new int[max - min + 1];
        for (int i = min; i <= max; i++) {
            answer[i - min] = arr[i];
        }
        return answer;
    }
}
/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : Arrays.asList(-1);
    }
}
 */