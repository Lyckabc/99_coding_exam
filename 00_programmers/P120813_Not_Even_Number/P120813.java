package P120813;

import java.io.*;
import java.util.*;


public class P120813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        int n = Integer.parseInt(br.readLine());

        int[] output = sol.solution(n);

        for (int i : output) {
            System.out.print(i + " ");
        }

    }
}

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> save = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!(i % 2 == 0)) {
                save.add(i);
            }
        }
        int[] arr = new int[save.size()];
        for (int i = 0; i < save.size(); i++) {
            arr[i] = save.get(i);
        }

        return arr;
    }
}