package TopKFrequentElements;

import java.io.*;
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = solution.topKFrequent(nums, k);
        for (int num : output) {
            System.out.print( num + " ");
        }
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // nums 의 value를 키값으로
        Map<Integer, Integer> map = new HashMap<>();
        int[] listtop ;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] Bucket = new List[nums.length + 1];
        for (Integer key : map.keySet()) {
            int count = map.get(key);
            if (Bucket[count] == null) {
                Bucket[count] = new ArrayList<>();
            }
            Bucket[count].add(key);
        }

        List<Integer> List = new ArrayList<>();
        for (int i = Bucket.length-1; i >= 0 && List.size() < k; i--) {
            if (Bucket[i] == null) continue;
            List.addAll(Bucket[i]);
        }

        listtop = new int[k];
        for (int i = 0; i < k; i++) {
            listtop[i] = List.get(i);
        }
        return listtop;
    }
}