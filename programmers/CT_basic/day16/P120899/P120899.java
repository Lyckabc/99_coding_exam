package programmers.CT_basic.day16.P120899;
/**
 * Class: P120899
 *
 * @author lyckabc
 * @date 2024-07-21 23:21
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120899 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 2, 3};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(array)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sortedArr = array.clone();
        Arrays.sort(sortedArr);
        int lenArr = array.length;
        answer[0] = sortedArr[lenArr - 1];
        answer[1] = searchIdx(array, sortedArr[lenArr - 1]);
        return answer;
    }
    public int searchIdx(int[] arr, int val) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;   
        }
        return idx;
    }
}
/*
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
 */
/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
    }
}
 */