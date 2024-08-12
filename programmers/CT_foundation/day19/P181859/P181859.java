package day19.P181859;
/**
 * Class: P181859
 *
 * @author lyckabc
 * @date 2024-08-12 13:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181859 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 1, 1, 0};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (st.isEmpty()) {
                st.push(tmp);
            } else if (!st.isEmpty()) {
                if (st.peek().equals(tmp)) st.pop();
                else if (!st.peek().equals(tmp)) st.push(tmp);
            } 
        }
        if (st.isEmpty()) return new int[] {-1};
        
        int lenSt = st.size();
        int[] answer = new int[lenSt];
        for (int i = lenSt - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        
        return answer;
    }
}
/*
class Solution {

    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else {
                if (list.get(list.size() - 1) == arr[i]) {
                    list.remove(list.size()- 1);
                } else {
                    list.add(arr[i]);
                }
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
 */