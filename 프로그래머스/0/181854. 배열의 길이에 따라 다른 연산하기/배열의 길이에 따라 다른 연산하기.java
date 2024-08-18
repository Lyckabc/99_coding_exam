class Solution {
    public int[] solution(int[] arr, int n) {
        int lenArr = arr.length;
        int[] answer = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            if (lenArr % 2 == 1 && i % 2 == 0) {
                answer[i] += arr[i] + n;
            } else if (lenArr % 2 == 0 && i % 2 == 1) {
                answer[i] += arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}