package programmers.CT_basic.day22.P120878;
/**
 * Class: P120878
 *
 * @author lyckabc
 * @date 2024-09-24 22:34
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120878 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 12;
        int b = 21;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(a,b));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
        int gcdNum = gcd(a,b);
        b /= gcdNum;

        if (b == 1) return 1;

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        if (b == 1) return 1;

        return answer;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
/*
class Solution {
    public int solution(int a, int b) {
        int answer = ((a*1000)%b == 0) ? 1 : 2;
        return answer;
    }
}
//숫자 1000 이내에 범위에서 2의 소인수가 최대 9개 존재 가능하며(2^9) , 5의 소인수는 4개 존재 가능(5^4)합니다. 따라서 2^9 * 5^4 = 320000을 곱해주는 것입니다.
 */
/*
class Solution {
    public int solution(int a, int b) {
        b /= gcd(a, b);
        while (b != 1) {
            if (b % 5 == 0) {
                b /= 5;
                continue;
            }
            if (b % 2 == 0) {
                b /= 2;
                continue;
            }
            return 2;
        }
        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
 */
