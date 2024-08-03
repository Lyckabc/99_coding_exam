class Solution {
    public int solution(int n) {
        if (n <= 3) {
            if (n == 1){
                return 1;
            }
            return 2;
        }
        int sqrtNum = (int) Math.sqrt(n);
        
        if ( Math.pow(sqrtNum, 2) == n) {
            return 1;
        }else {
            return 2;
        }
    }
}