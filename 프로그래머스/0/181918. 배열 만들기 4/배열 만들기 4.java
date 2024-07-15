import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int stkSize = stkList.size();
            if (stkSize == 0 || stkList.get(stkSize - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            }
            else {
                stkList.remove(stkSize - 1);
            }
        }
        return stkList.stream().mapToInt(j -> j).toArray();
    }
}