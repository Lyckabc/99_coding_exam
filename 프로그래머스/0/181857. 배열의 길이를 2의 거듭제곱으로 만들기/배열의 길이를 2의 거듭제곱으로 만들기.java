class Solution {
    public int[] solution(int[] arr) {
        int len = powerOfTwo(arr.length);
        int[] answer = new int[len];
        for (int i = 0; i < answer.length; i++) {
            if (i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    public int powerOfTwo(int length) {
        int nThPower = 1;
        while (nThPower < length) {
            nThPower *= 2;
        }
        return nThPower;
    }
}