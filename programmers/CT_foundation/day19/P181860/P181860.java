package day19.P181860;
/**
 * Class: P181860
 *
 * @author lyckabc
 * @date 2024-08-12 11:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181860 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr,flag)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);
    }
}
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (flag[i]) {
                for (int j = 0; j < tmp * 2; j++) {
                    st.push(tmp);
                }
            } else {
                for (int j = 0; j < tmp; j++) {
                    st.pop();
                }
            }
        }
        int lenSt = st.size();
        int[] answer = new int[lenSt];
        for (int i = lenSt - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }
}
/*
import java.util.ArrayList;

class Solution {

    public int[] solution(int[] arr, boolean[] flag) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size()- 1);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
 */
/*
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++) stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
 */