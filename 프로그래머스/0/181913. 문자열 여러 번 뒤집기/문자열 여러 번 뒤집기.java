class Solution {
    char[] arr;
    public String solution(String my_string, int[][] queries) {
        arr = my_string.toCharArray();
        for (int[] query : queries) {
            reverseChar(query[0],query[1]);
        }
        return String.valueOf(arr);
    }
    public void reverseChar(int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[end - i + start];
            arr[end - i + start] = temp;
        }
    }
}