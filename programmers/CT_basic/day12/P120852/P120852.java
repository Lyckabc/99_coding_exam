package programmers.CT_basic.day12.P120852;
/**
 * Class: P120852
 *
 * @author lyckabc
 * @date 2024-07-19 22:59
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120852 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 17;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(n)));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int n) {
        String str = "";
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                str += i;
                str += " ";
            }
        }
        String[] strArr = str.split(" ");
        int lenStr = strArr.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int n) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();

        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
 */