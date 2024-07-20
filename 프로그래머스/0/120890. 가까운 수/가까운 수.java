class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int curN = array[i];
            if (Math.abs(curN - n)  < Math.abs(min - n)) {
                min = curN;
            } else if (Math.abs(curN - n) == Math.abs(min - n)) {
                min = Math.min(min, curN);
            }
        }
        return min;
    }
}