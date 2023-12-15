package N704;

import java.io.*;
import java.util.*;

public class N704 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        try {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), ",");
            int[] nums = new int[tokenizer.countTokens()];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(tokenizer.nextToken().trim());
            }

            int target = Integer.parseInt(br.readLine());

            int output = sol.search(nums, target);
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int top = nums.length - 1;
        int bott = 0;

        for (int i = 0; i < nums.length; i++) {
            int  mid = (top + bott) / 2;

            if (target < nums[mid]) {
                top = mid - 1;
            } else if (target > nums[mid]) {
                bott = mid + 1;
            } else {
                return mid;
            }
        System.gc();
        }
        return -1;
    }
}