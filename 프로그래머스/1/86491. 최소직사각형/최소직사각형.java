class Solution {
    public int solution(int[][] sizes) {

        int minWidth = 0;
        int minHeight = 0;
        for (int[] size : sizes) {
            minWidth = Math.max(minWidth, Math.max(size[0], size[1]));
            minHeight = Math.max(minHeight, Math.min(size[0], size[1]));
        }
        return minWidth * minHeight;
    }
}