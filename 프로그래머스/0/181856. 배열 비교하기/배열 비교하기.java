class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 > len2) return 1;
        else if (len2 > len1) return -1;
        int sum1 = 0;
        int sum2 = 0;
        for (int n : arr1) {
            sum1 += n;
        }
        for (int n : arr2) {
            sum2 += n;
        }
        if (sum1 > sum2) return 1;
        else if (sum2 > sum1) return -1;
        return answer;
    }
}