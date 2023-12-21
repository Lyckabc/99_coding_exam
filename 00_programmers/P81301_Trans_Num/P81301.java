package P81301;


import java.util.*;

public class P81301 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "one4seveneight";

        int output = sol.solution(s);
        System.out.println(output);
    }
}

class Solution {
    public int solution(String s) {
        Map<Integer, String> ZtoNMap = new HashMap<>();
        ZtoNMap.put(0, "zero");
        ZtoNMap.put(1, "one");
        ZtoNMap.put(2, "two");
        ZtoNMap.put(3, "three");
        ZtoNMap.put(4, "four");
        ZtoNMap.put(5, "five");
        ZtoNMap.put(6, "six");
        ZtoNMap.put(7, "seven");
        ZtoNMap.put(8, "eight");
        ZtoNMap.put(9, "nine");
        int answer = 0;
        long Hashchk = 1;
        int[] Prime = MakePrime();

        for (int i = 0; i < ZtoNMap.size(); i++) {
            long HashKey = 1;
            String word = ZtoNMap.get(i);
            for (int j = 0; j < ZtoNMap.get(i).length(); j++) {
                HashKey *= Prime[word.charAt(j)-'a'];
            }
            ZtoNMap.put(i, Long.toString(HashKey));
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                answer = answer * 10 + c - '0';
            } else {
                Hashchk *= Prime[c - 'a'];
                for (int j = 0; j < ZtoNMap.size(); j++) {
                    if (ZtoNMap.get(j).equals(Long.toString(Hashchk))) {
                        answer = answer * 10 + j;
                        Hashchk = 1;
                    }
                }
            }
        }

        return answer;
    }
    public int[] MakePrime() {
        List<Integer> list = new ArrayList<>();
        int num = 200;
        boolean[] check = new boolean[num + 1];
        check[0] = check[1] = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (check[i]) continue;
            for (int j = i*i; j < check.length; j+=i) {
                check[j] = true;
            }
        }
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) list.add(i);
        }

        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            intArray[i] = list.get(i);
        }

        return intArray;
    }
}