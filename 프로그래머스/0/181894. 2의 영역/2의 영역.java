class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int lenArr = arr.length;
        for (int i = 0; i < lenArr; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            } 
        }
        if (min == Integer.MAX_VALUE) return new int[] {-1};
        int[] answer = new int[max - min + 1];
        for (int i = min; i <= max; i++) {
            answer[i - min] = arr[i];
        }
        return answer;
    }
}