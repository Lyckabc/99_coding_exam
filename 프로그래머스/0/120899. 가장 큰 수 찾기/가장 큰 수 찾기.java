import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] sortedArr = array.clone();
        Arrays.sort(sortedArr);
        int lenArr = array.length;
        answer[0] = sortedArr[lenArr - 1];
        answer[1] = searchIdx(array, sortedArr[lenArr - 1]);
        return answer;
    }
    public int searchIdx(int[] arr, int val) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;   
        }
        return idx;
    }
}