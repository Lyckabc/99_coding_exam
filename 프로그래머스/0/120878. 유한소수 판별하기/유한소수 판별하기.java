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