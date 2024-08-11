class Solution {
    public int[] solution(int[] arr) {
        int totalLength = 0;
        for (int n : arr) {
            totalLength += n;
        }
        
        int[] result = new int[totalLength];
        
        // Fill the result array
        int index = 0;
        for (int n : arr) {
            for (int i = 0; i < n; i++) {
                result[index++] = n;
            }
        }
        
        return result;
    }
}