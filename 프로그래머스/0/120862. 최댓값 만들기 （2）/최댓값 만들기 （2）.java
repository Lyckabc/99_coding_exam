class Solution {
    public int solution(int[] numbers) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int curNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (i == j) continue;
                int preNum = numbers[j];
                maxNum = Math.max(curNum * preNum, maxNum);
            }
        }
        return maxNum;
    }
}