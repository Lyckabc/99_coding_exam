package day19.P181858;
/**
 * Class: P181858
 *
 * @author lyckabc
 * @date 2024-08-12 17:19
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181858 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 4;
        int[] arr = {0, 1, 1, 1, 1};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr,k)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (!map.containsKey(tmp) && map.size() < k) {
                map.put(tmp, 1);
                st.push(tmp);
            }
        }
        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            if (st.size() <= i) {
                answer[i] = -1;
            } else if(!st.isEmpty()) {
                answer[i] = st.pop();
            }
        }
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : arr)
            if (!arrayList.contains(a))
                arrayList.add(a);

        int idx = 0;
        int[] answer = new int[k];
        for (int i = 0;i < k;i++)
            answer[i] = -1;
        for (int i = 0;i < k && i < arrayList.size();i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
}

 */