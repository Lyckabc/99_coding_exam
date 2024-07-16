import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share).intValue();
        return answer;
    }
    public BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }
    public BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}