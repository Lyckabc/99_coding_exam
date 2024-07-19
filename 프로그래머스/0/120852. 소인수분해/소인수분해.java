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