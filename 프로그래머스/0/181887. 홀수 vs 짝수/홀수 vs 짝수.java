class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            int curNum = num_list[i];
            if (i % 2 == 0) {
                odd += curNum;
            } else {
                even += curNum;
            }
        }
        return Math.max(odd,even);
    }
}