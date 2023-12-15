package GroupAnagrams;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"};
        List<List<String>> result = solution.groupAnagrams(strs);

        // 결과 출력
        System.out.println("Input: " + Arrays.toString(strs));
        System.out.println("Output: " + result);
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<BigInteger, List<String>> map = new HashMap<>();
        int[] primes = make_prime(101);

        for (int i = 0; i < strs.length ; i++) {
            BigInteger Hashkey = BigInteger.ONE;
            for (int j = 0; j < strs[i].length(); j++) {
                char c = strs[i].charAt(j);
                Hashkey = Hashkey.multiply(BigInteger.valueOf(primes[c - 'a']));
                System.out.println("Hashkey : " + Hashkey);
            }
            if(!map.containsKey(Hashkey)) {
                map.put(Hashkey, new LinkedList<>());
                System.out.println("map1 : " + map);
            }
            map.get(Hashkey).add(strs[i]);
            System.out.println("map2 : " + map);
        }
        System.out.println("map3 : " + map);
        return new LinkedList<>(map.values());
    }
    public static int[] make_prime(int num) {
        List<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[num + 1];
        check[0] = check[1] = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (check[i])
                continue;
            for (int j = i * i; j < check.length; j += i)
                check[j] = true;
        }

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) list.add(i);
        }

        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
        return intArray;
    }
}